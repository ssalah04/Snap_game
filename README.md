# Snap Card Game

A Java console-based version of the card game Snap. Players take turns dealing cards from a shuffled deck. If two cards with the same symbol appear in a row, the active player must type `snap` within 2 seconds to win.

## Features

- Two-player game
- Standard 52-card deck
- Shuffles the deck before play
- Alternates turns between players
- Detects matching card symbols
- Timed Snap response
- Uses classes for `Card`, `CardGame`, `Player`, and `Snap`
- Uses an enum for card suits

## How to Play

1. Run the program.
2. Enter both player names.
3. Players take turns pressing Enter to deal a card.
4. When two cards with the same symbol appear in a row, in under 2 seconds, type:

```text
snap
