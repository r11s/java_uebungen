## Aufgabe

- Erstellen eines Beziehungs-Diagrammes mit allen benötigten Klassen.

- Implementieren eines rudimentären Klassengerüstes in Java, welches nichts ausser den Beziehungen realisiert.

## Beobachtungen

- Jede CD bzw. Platte wird in Form eines Albums gespeichert (Klasse `Album`). Jedes solches Objekt soll eine Liste der enthaltenen Musikstücke speichern. Des weiteren möchte man den `Typ` des Tonträgers (z.B. CD, LP, mp3-File), das Herausgabejahr, den Album-Titel, die Band, welche das Album eingespielt hat und die Information, ob es sich um eine Live-Aufnahme handelt, aus dem Objekt herauslesen können.

- Für die Tonträger-Information soll eine eigene Klasse `Tontraeger` erstellt werden, welche später mit eigenen, zusätzlichen Informationen bestückt werden soll, die aber zurzeit noch nicht bekannt sind.

- Die Gruppe von Musikern, welche das Album eingespielt hat, wird mit einer eigenen Klasse `Band` realisiert. Deren einzelne Mitglieder stammen aus der Klasse `Musiker`, welche persönliche Informationen, wie Name oder Geburtsdatum enthalten wird.

- Die einzelnen Stücke werden mit einer eigenen Klasse `Stueck` gespeichert. Dort finden sich Informationen wie der Titel und die Länge des Stücks.

