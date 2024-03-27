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

Schreiben Sie ein Programm, welches folgenden Term korrekt berechnet und das Ergebnis ausgibt: $3 * (9 + 3) + 4 * 8$

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

Schreiben Sie ein Programm, das – bei gegebenem Radius r eines Kreises – die Kreisfläche $(πr^2)$ und den Kreisumfang $(2πr)$ berechnet und auf der Standardausgabe mit Hinweistext ausgibt. 

Wie groß wäre das Volumen, falls es sich statt eines Kreises um eine Kugel $(\frac{4}{3}πr^3)$ handelt? Berechnen Sie das Volumen und geben Sie es aus! Sie können die Kreis- und die Kugelberechnungen im gleichen Programm stattfinden lassen.

### Aufgabe 3: (1 Punkt)

Zur Lösung quadratischer Gleichungen der Form $x^2 + px + q = 0$ wird die pq-Formel verwendet:
```math
x_{1,2} = - \frac{p}{2} \pm \sqrt{\left( \frac{p}{2} \right)^2 - q}
```
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

## Übungsblatt 4

### Aufgabe 1: (Freier Fall) (1 Punkt)

Die zurückgelegte Strecke eines frei fallenden Körpers berechnet sich nach folgender Formel: $s(t) = \frac{1}{2} g * t^2$, wobei g die Fallbeschleunigung $(9.80665 \frac{m}{s^2})$ und t die vergangene Zeit in Sekunden darstellt. Schreiben Sie ein Programm, welches die zurückgelegte Strecke im Sekundentakt, wie im Beispiel gezeigt, ausgibt. Die Falldauer soll vom Benutzer eingegeben werden.

Beispiel:  
> Bitte Falldauer in Sekunden eingeben: 8  
> Zeit: 1 Sekunden: Zurückgelegte Strecke: 4.903325 m  
> Zeit: 2 Sekunden: Zurückgelegte Strecke: 19.6133 m  
> ...  
> Zeit: 8 Sekunden: Zurückgelegte Strecke: 313.8128 m  

Modifizieren Sie das Programm, so dass nur für jede fünfte Sekunde eine Ausgabe erfolgt! Beginnen Sie bei der Ausgabe mit der ersten Sekunde, gefolgt von der sechsten Sekunde.

### Aufgabe 2: (Reihenberechnung) (1 Punkt)

Gegeben sei folgende Reihe:
```math
6 * \sum_{k=1}^\infty \frac{1}{k^2}
```
Schreiben Sie die ersten fünf Glieder der Reihe auf Papier auf Ihrer schriftlichen Lösung auf! Schreiben Sie ein Programm, welches die Reihe berechnet und das Ergebnis bei jedem Schleifendurchlauf ausgibt. Brechen Sie die Berechnung ab, wenn die Änderung des Reihenwertes in einem Schleifendurchlauf kleiner als $10^{-5}$ ist.

### Aufgabe 3: (Das kleine Einmaleins) (1 Punkt)

Schreiben Sie ein Programm, welches das kleine 1x1 ausgibt. Hinweis: Beginnen Sie damit zunächst die ersten zehn Produkte mit Hilfe einer Schleife auszugeben, d.h. 1x1=1, 1x2=2, … 1x9=9, 1x10=10.

Ausgabe:  
> 1 x 1 = 1  
> 1 x 2 = 2  
> 1 x 3 = 3  
> ...  
> 2 x 1 = 2  
> 2 x 2 = 4  
> 2 x 3 = 6  
> ...  
> 10 x 8 = 80  
> 10 x 9 = 90  
> 10 x 10 = 100  

### Aufgabe 4: (Primzahlen) (1 Punkt)

Schreiben Sie ein Programm, welches für eine vom Benutzer eingegebene ganze Zahl ermittelt, ob diese eine Primzahl ist.

Beispiel 1:
> Bitte zu untersuchende Zahl eingeben: 47  
> Untersuchte Zahl ist eine Primzahl

Beispiel 2:
> Bitte zu untersuchende Zahl eingeben: 51  
> Untersuchte Zahl ist keine Primzahl

## Übungsblatt 5

### Aufgabe 1: (Temperaturtabelle) (1 Punkt)

Schreiben Sie ein Programm namens Temperaturumwandlung, das eine Temperaturtabelle auf dem Bildschirm gemäß der Formel $Grad \\ Celsius = \frac{5}{9} * (Grad \\ Fahrenheit - 32)$ ausgibt. Die Temperaturtabelle soll in der ersten Spalte Temperaturwerte in Fahrenheit (als ganze Zahl von 0 Grad Fahrenheit bis 300 Fahrenheit, jeweils inklusive) enthalten und in der zweiten Spalte die entsprechenden Temperaturwerte in Celsius (vom Typ float) auf zwei Nachkommastellen abgeschnitten oder gerundet.

| Fahrenheit | Celsius |
|       ---: |    ---: |
| 0          | -17.77  |
| 1          | -17.22  |
| 2          | -16.66  |
| ...        | ...     |
| 299        | 148.33  |
| 300        | 148.88  |

Die Spalten sollen durch ein Tabulatorzeichen getrennt werden, ansonsten muss die Tabelle nicht formatiert sein.

### Aufgabe 2: (Querprodukt) (1 Punkt)

Schreiben Sie ein Programm namens Querprodukt, welches das "Querprodukt" einer int-Zahl berechnet und dieses mit einer Meldung am Bildschirm anzeigt. Die int-Zahl soll von der Standardeingabe solange eingelesen werden, bis sie gültig ist (zwischen 0 und einer Million, jeweils inklusive). Bei Eingabe einer ungültigen int-Zahl soll zusätzlich eine Fehlermeldung erscheinen und ein erneutes Einlesen erfolgen.

Beispiel:  
> Geben Sie bitte eine Zahl ein: -3  
> FEHLER – Zahl ist ungültig.  
> Geben Sie bitte eine Zahl ein: 1348213  
> FEHLER – Zahl ist ungültig.  
> Geben Sie bitte eine Zahl ein: 3225  
> Das Querprodukt der Zahl 3225 beträgt 60  

### Aufgabe 3: (Modellierung) (1 Punkt)

Modellieren Sie schriftlich mit einem Struktogramm oder einem Aktivitätsdiagramm die Querproduktaufgabe!

### Aufgabe 4: (Potenz) (1 Punkt)

Schreiben Sie ein Programm das die Potenz $a^b$ berechnet und das Ergebnis auf der Standardausgabe anzeigt. Sowohl die Basis $(a)$, als auch der Exponent $(b)$ werden über die Standardeingabe (a vom Typ double, b vom Typ int) eingelesen. In Abhängigkeit vom Exponenten $(b)$ gilt für $a^b$:
```math
\begin{align*}
b > 0 &: a^b = \overbrace{a * a * a * ... * a}^{b-mal} \\
b = 0 &: a^0 = 1 \\
b < 0 &: a^b = \frac{1}{\underbrace{a * a * a * ... * a}_{b-mal}}
\end{align*}
```

Bei dieser Aufgabe darf die Klasse Math und deren Methoden nicht verwendet werden.
