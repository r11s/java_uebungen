# Bemerkungen

## Algemein

Die Enum-Typen sind deutsch. Diese können auch in andere
Sprachen geändert werden.

In der Datei **TestResultat.txt** finden sich die Daten vom Testlauf.

## Enum Languages

Den Enum Languages habe ich mit der Funktion `code()`
ausgestattet. Ich verlasse mich nicht auf die Funktion
`ordinal()`, da die Reihenfolge der Sprachen geändert oder
eine weitere hinzugefügt werden kann.

## Enum Season

Die Übersetzungen der Jahreszeiten finden sich in diesem
Enum. Man könnte sie auch in eine eigene Klasse oder Datei
auslagern.

## Enums Tutorial

Unter
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
und mit diesem Beispiel hat man ein gutes Tutorial.

Hier noch ein Enum-Beispiel. (Für die Aufgabe wird diese
Klasse nicht benötigt.)
```
public enum Noten {
  SEHR_GUT(6),
  GUT(5),
  GENUEGEND(4),
  UNGENUEGEND(3),
  SCHWACH(2),
  SEHR_SCHWACH(1);

  private final int note;

  Noten(int note) {
    this.note = note;
  }

  public int getNote() {
    return this.note;
  }
}
```
## Markdown

Es gibt ein Tutorial dazu unter
https://www.markdowntutorial.com/
.