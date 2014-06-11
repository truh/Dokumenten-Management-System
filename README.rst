###########################
Dokumenten-Mangement-System
###########################

======
Angabe
======

Ein Dokumenten Management System (kurz DMS genannt) erlaubt das zentrale 
Speichern von beliebigen Dokumenten. Dokumente können somit gezielt an 
einem Platz gesucht und administriert werden. Eine zentrale Aufgabe eines 
DMS ist es den Verlauf eines Dokuments aufzuzeichnen und jederzeit abrufen 
zu können.

~~~~~~~~~~~~~~~~~~~*
Suche / Indizierung
~~~~~~~~~~~~~~~~~~~

Ein DMS ist nur so gut, wie seine Suchfunktion. 
Es soll daher möglich sein nach folgenden Parametern zu suchen.

* Autor
* Kategorie
* Kommentar
* Dokumentname
* Dokumenttyp
* Schlüsselwörter

Diese Parameter beschreiben auch die Eigenschaften eines Dokuments in dem DMS.

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Authentifikation / Autorisierung
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Bei dem DMS soll es sich um ein rollenbasiertes System handeln. 
Folgende Rollen sollen im System implementiert werden:

* Administrator:
  Der Administrator hat alle Rechte und kann auf alle Dokumente zugreifen.

* Dokumentbesitzer:
  Jener Benutzer der ein Dokument im DMS erstmalig erfasst, wird als Dokument 
  Besitzer vermerkt.

* Dokumentnutzer: Der Administrator und der Dokumentbesitzer kann beliebigen 
  andere Benutzer den Zugriff auf das Dokument gewähren.

Zur Vereinfachung wird beim Zugriff nicht zwischen Lese- und Schreibrechten 
unterschieden, sprich Zugruff auf ein Dokument bedeutet Lese- und 
Schreibzugriff.

~~~~~~~
Verlauf
~~~~~~~

Für jedes Dokument in dem DMS soll mit einer Versionsnummer versehen und 
gespeichert werden. Jede Änderung des Dokuments führt dazu, dass die 
Versionsnummer um eins erhöht wird. Alle Änderungen werden mit folgenden 
Parameter im DMS gespeichert:

* Versionsnummer
* Benutzer
* Datum / Uhrzeit
* Kommentar

~~~~~~~~~~~~~~~~~
Upload / Download
~~~~~~~~~~~~~~~~~

Das DMS soll in dieser Version folgende Aktionen erlauben:

* Upload:
  Ein neues bzw. eine neue Version eines Dokuments werden im DMS abgelegt 
  und die Versionsnummer wird um eins erhöht. Ebenso wird der Verlauf um diese 
  Aktion erweitert. Wenn das Dokument zuvor von dem Benutzer heruntergeladen 
  wurde, so führt der Upload zu einer Freigabe des Dokuments, wodurch anderen 
  Dokumentennutzer das Dokument bearbeiten können. Es kann immer nur ein 
  Dokument hochgeladen werden. Ein Hochladen mehrerer Dokumente bzw. ganzer 
  Verzeichnisstrukturen sind in der nächsten Ausbaustufe angedacht.

* Checkout / Download:
  Ein Checkout eines Dokuments führt gleichzeitig dazu, dass das Dokument im 
  DMS als GESPERRT vermerkt wird. Diese Sperre gilt für alle anderen Benutzer 
  und kann nur von dem Dokumentnutzer durch einen UPLOAD einer neuen Version 
  bzw. mit Hilfe der GUI durch den Dokumentbesitzer bzw. Administrator 
  freigegeben werden.

* Löschen
  Ein bestehendes Dokument kann nur gelöscht werden, wenn es nicht gesperrt 
  ist. Das Löschen des Dokuments erfolgt auch physisch und führt dazu das 
  alle Einträge im DMS (Bsp. Verlauf, Dokumentbenutzer, etc.) gelöscht werden.

Erstelle mit Hilfe der **Frameworks JEE oder Play** eine Webapplikation, 
die die Funktionalität dieses Dokumentenmanagementsystems abbildet. 
Verwende das **ORM Framework Hibernate** um die Daten des Dokuments in einer 
**Datebank** abzuspeichern. Führe zu Beginn der Arbeit eine ausführliche 
**Analyse & Designphase** durch, um die Problem noch vor der Implementierung 
mit den Projektmitgliedern abzuklären.

.. header::

    +-------------+-------------------+------------+
    | ###Title### | Andreas Willinger | 2014-06-11 |
    |             | Jakob Klepp       |            |
    +-------------+-------------------+------------+

.. footer::

    ###Page### / ###Total###
