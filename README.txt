############################
# HOW TO USE               #
############################

Für den Handballcoach:
Das App soll dir helfen, am Spielfeldrand die Statistik zu führen.
Du kannst damit die Angriffe deiner Mannschaft (Abschnitt «Angriff»), erfolgreiche Angriffe der gegnerischen Mannschaft (Abschnitt «Verteidigung») und die technischen Fehler deiner Mannschaft eintragen (Abschnitt «Technische Fehler»).

Unter dem Button "Spielansicht" wird ein Spiel gestartet, darin kannst du die Statistik führen. Sobald das Spiel beendet ist, muss unten der Spielname eingetragen und mit dem Button "Speichern" das Spiel gespeichert werden. Danach ist es unter "Spiel Statistik" einsehbar. 

In den Settings kannst du den Darkmode oder den Lighmode auswählen, auch die Sprache kannst du auswählen. Im Moment ist Englisch und Deutsch implementiert.


############################
# TECHNISCHE ANFORDERUNGEN #
############################

- (1) Lokale Persistenz mittels Preferences oder Dateisystem
- (3) Lokale Persistenz mittels Datenbank (Room bzw. SQLite)
- (1) Erstellung von sinnvollen Unit-Tests


############################
# BUILD                    #
############################

- Gradle
-- RoomDB
-- Language (resourceConfigurations)
-- Testing (JUnit / Espresso)
-- ViewBinding
-- Viewmodel
-- Preferences

- Manifest
-- Launcer Icon
-- ScreenOrientation

