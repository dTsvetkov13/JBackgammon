# JBackgammon

A desktop Backgammon game built in Java with a Swing GUI. Written as a team project; no external dependencies beyond the JDK. We use the Observer design pattern.

## Tech stack

| Layer | Technology |
|---|---|
| Language | Java (JDK 8+) |
| GUI | Java Swing / AWT (`javax.swing`, `java.awt`) |
| Build | Plain `javac` — no Maven or Gradle |
| Testing | Manual test harness in `src/tests/` |

## Architecture

```
src/
├── core/          # Game — main orchestrator, owns the JFrame + CardLayout
├── models/        # Board, Player, Dice, MoveLogger, Position, Log, Event
├── views/         # Swing panels: Menu, Board, ColumnView, PullView, EndScreen
├── listeners/     # ListenersManager singleton (pub/sub event bus) + IEventListener
├── common/        # Shared enums: EventType, Team, GlobalConstants
├── structures/    # Hand-rolled generics: ArrayList<T>, Stack<T>, Node<T>, Pair<U,V>
├── interfaces/    # IBoard, IList, IStack, IMoveLogger
├── resources/     # PNG assets (board, pieces, dice faces)
└── tests/         # GameTest (entry point) + unit tests per class
```

**Event flow:** every component communicates exclusively through `ListenersManager`. When a user action occurs (e.g. clicking *Start*), the view fires an `Event<T>` tagged with an `EventType`; `ListenersManager` broadcasts it to all registered `IEventListener` instances; `Game` reacts by swapping the active card in the layout.

`MoveLogger` wraps two `Stack<Log>` instances to provide undo/redo over moves. `Dice` listens for a `ThrowDice` event and replies with `DiceThrown`, carrying a `Pair<Integer, Integer>`.

## Running locally

**Prerequisites:** JDK 8 or later on `PATH`.

```bash
# from the repo root
javac -d bin $(find src -name "*.java")   # compile
java  -cp bin tests.GameTest              # run
```

On Windows (no `find`):

```powershell
Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName } |
    ForEach-Object { javac -d bin $_ }
java -cp bin tests.GameTest
```

The game opens a 1000×1000 px window. Click **Start** on the menu to begin a match.
