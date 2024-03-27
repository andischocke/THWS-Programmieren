# Übungsblätter
Alle Übungsblätter mit Aufgaben aus den Modulen "Programmieren 1" und "Programmieren 2", die an der Technischen Hochschule Würzburg-Schweinfurt angeboten werden.

## Übungsblatt 1

### Aufgabe 1: (0 Punkte)

- Installieren Sie auf Ihrem eigenen Computer/Notebook das Java Development Kit (JDK) von Oracle. Ergänzen Sie die Umgebungsvariable PATH um das bin-Verzeichnis der JDK Installation.
- Rufen Sie ein Konsolenfenster auf, z. B. Start -> Ausführen -> cmd und testen Sie die Befehle javac und java. Wenn beide Befehle ausgeführt wurden, haben Sie das JDK richtig konfiguriert.

### Aufgabe 2: (2 Punkte)

Erstellen Sie eine Datei Application.java, die bei Ausführung "Willkommen zu Programmieren 1" ausgibt.

- Übersetzen und starten Sie das Programm auf der Konsole! Dokumentieren Sie stichpunktartig die dazu notwendigen Schritte! (1 Punkt)
- Übersetzen und starten Sie das Programm mit Eclipse! Dokumentieren Sie stichpunktartig die dazu notwendigen Schritte! (1 Punkt)

### Aufgabe 3: (1 Punkt)

Schreiben Sie ein Programm, welches folgenden Term korrekt berechnet und das Ergebnis ausgibt: 3 * (9 + 3) + 4 * 8

## Übungsblatt 2

### Aufgabe 1: (1 Punkt) 

Gegeben sei folgendes Programm:
```java
public class Tausch {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        // Vor dem Tausch
        System.out.println(x);
        System.out.println(y);

        // Tausch
        int temp = x;
        x = y;
        y = temp;

        // Nach dem Tausch
        System.out.println(x);
        System.out.println(y);
    }
}
```
Tauschen Sie die Inhalte der beiden Variablen, d. h. wenn vor dem Tausch x den Wert 5 hatte und y den Wert 7, dann soll x nach dem Tausch den Wert 7 haben und y den Wert 5. Führen Sie den Tausch so durch, dass der Tausch funktioniert, egal mit welchem Wert x und y initialisiert werden.

### Aufgabe 2: (1 Punkt)

Schreiben Sie ein Programm, das – bei gegebenem Radius r eines Kreises – die Kreisfläche (πr²) und den Kreisumfang (2πr) berechnet und auf der Standardausgabe mit Hinweistext ausgibt. Wie groß wäre das Volumen, falls es sich statt eines Kreises um eine Kugel handelte (4/3 πr³)? Berechnen Sie das Volumen und geben Sie es aus! Sie können die Kreis- und die Kugelberechnungen im gleichen Programm stattfinden lassen.

### Aufgabe 3: (1 Punkt)

Zur Lösung quadratischer Gleichungen der Form x² + px + q = 0 wird die pq-Formel verwendet: x₁,₂ = -(p/2) ± √((p/2)² - q)

Schreiben Sie ein Programm, das bei Angabe der Variablen p und q die beiden Lösungen für x ausrechnet! Recherchieren Sie mit einer Suchmaschine, mit welchem Befehl in Java eine Wurzel gezogen werden kann.

### Aufgabe 4: (1 Punkt)

Schreiben Sie ein Programm, das die Variablen „stunden“, „minuten“ und „sekunden“ enthält. Initialisieren Sie die Variablen mit der aktuellen Uhrzeit.

- Berechnen Sie die Anzahl der Sekunden seit Mitternacht und geben Sie diese aus!
- Berechnen Sie die Anzahl der verbleibenden Sekunden für diesen Tag und geben Sie diese aus!
- Berechnen Sie, wie viel Prozent des Tages schon vergangen sind und geben Sie das Ergebnis aus! Die Prozentangabe soll auf mehrere Nachkommastellen genau angegeben werden.

## Übungsblatt 3

### Aufgabe 1: (Modulo) (1 Punkt)

Schreiben Sie ein Programm, welches vom Benutzer eine ganze Zahl einliest und mithilfe des Modulo-Operators überprüft, ob die Zahl durch 7 teilbar ist. Anschließend soll eine entsprechende Ausgabe auf der Standardausgabe erfolgen. Was passiert, wenn der Modulo Operator auf negative Zahlen angewendet wird? Schreiben Sie die zugehörige Vorzeichentabelle auf.

### Aufgabe 2: (Pizzarechner) (1 Punkt)

Auf einer Pizzakarte werden Pizzen oft in unterschiedlichen Durchmessern (26cm, 28cm, 30cm) zu unterschiedlichen Preisen angeboten. Schreiben Sie ein Programm, das von zwei Pizzen jeweils den Durchmesser und den Preis einliest. Das Programm soll die Fläche der Pizza ausrechnen und daraufhin ausgeben, welche Pizza das bessere Größen-/Preisverhältnis hat. Vorgehensweise: Belegen Sie zunächst die Variablen mit festen Werten und implementieren Sie die Berechnung und die Ausgabe. Wenn alles soweit läuft, fügen Sie das Einlesen der Werte hinzu. So müssen Sie nicht bei jedem Testlauf erneut die Werte eingeben.

### Aufgabe 3: (Einzelzeichen) (1 Punkt)

Schreiben Sie ein Programm, das ein Einzelzeichen einliest. Ist das Einzelzeichen 
- ein Großbuchstabe, soll das Wort "Großbuchstabe" ausgegeben werden.
- eine hexadezimale Ziffer (d.h. '0' – '9', 'a' – 'f'  oder  'A' – 'F'), dann soll „Hexadezimale Ziffer“ ausgegeben werden.
- eine binäre Ziffer, dann soll "binäre Ziffer" ausgegeben werden.
- eine Ziffer im Oktalsystem, dann soll "oktale Ziffer" ausgegeben werden.

Fällt ein Einzelzeichen in mehrere Kategorien, sollen alle passenden Ausgaben erscheinen. Fällt ein Einzelzeichen in keine der Kategorien, soll die Ausgabe „Unbekannt“ erfolgen.

### Aufgabe 4: (Würfelwurf) (1 Punkt)

Der Befehl Math.random() gibt eine zufällige Double-Zahl zwischen 0 (inklusive) und 1 (exklusive) zurück. Für eine zurückgegebene Zahl x gilt also 𝑥 ∈ [0..1). Simulieren Sie den Wurf eines 6-seitigen Würfels. Wenn eine 1 gewürfelt wurde, soll der Text "Eins gewürfelt" ausgegeben werden, bei einer 2 "Zwei gewürfelt", etc.
