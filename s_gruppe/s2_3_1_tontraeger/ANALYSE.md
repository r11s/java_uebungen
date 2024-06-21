## Analyse


* Jede CD bzw. Platte wird in Form eines Albums gespeichert (Klasse Album).
--> **Klasse Album; Attribute: Stueck[], Typ, Herausgabejahr, Titel, Band**

- Jedes solches Objekt soll eine Liste der enthaltenen Musikstücke speichern. --> Beziehung, Attribut

- Des weiteren möchte man den Typ des Tonträgers (z.B. CD, LP, mp3-File),
--> **Enum Klasse Typ Attribute: CD, LP, MP3**

das Herausgabejahr, den Album-Titel, die Band,welche das Album eingespielt hat

und die Information, ob es sich um eine Live-Aufnahme handelt,
aus dem Objekt herauslesen können.

* Für die Tonträger-Information soll eine eigene Klasse Tontraeger erstellt werden, welche später mit eigenen, zusätzlichen Informationen bestückt werden soll, die aber zurzeit noch nicht bekannt sind. --> **Klasse Tontraeger**

* Die Gruppe von Musikern, welche das Album eingespielt hat,
wird mit einer eigenen Klasse Band realisiert. --> **Klasse Band; Attribute: Musiker[]** (Musikerliste)**

-Deren einzelne Mitglieder stammen aus der Klasse Musiker, welche persönliche Informationen, wie Name oder Geburtsdatum enthalten wird. --> **Klasse Musiker; Attribute: Name(Vorname, Nachname), Geburtdatum**


* Die einzelnen Stücke werden mit einer eigenen Klasse Stueck gespeichert. Dort finden sich Informationen wie der Titel und die Länge des Stücks. --> **Klasse Stueck; Attribute: Titel, Länge**
