Fragen Seite 32:

Kann man die Datei Kapitel1.Application.Class von Windows zu Linux kopieren und dort laufen lassen? 

Ja es geht.

Welche Software muss installiert sein?

Java Laufzeitumgebung

System.out.printf eventuell nochmal durchlesen - wenn erledigt entfernen 170723

Frage 2.2.4: Wertebereich von random() liegt zwischen 0.0 - 1.0

Frage 2.2.5 Quiz: Unübersichtlichkeit vermeiden ★
Unter Clean Code versteht man eine Reihe von Best Practices, die dafür sorgen, dass
Code gut zu lesen und zu verstehen sowie wartbarer, erweiterbarer und testbarer ist.
Es gibt leider auch genug Gegenbeispiele.
Was ist an folgendem Beispiel ungünstig?

double höhe = 12.34;
double breite = 23.45;
double tmp = 2 * (höhe + breite);
System.out.println( tmp );
tmp = höhe * breite;
System.out.println( tmp );

tmp wird doppelt verwendet. 

