# Reader

## ReaderPolimorfico

L'obiettivo di questo esercizio è l'utilizzo della classe **Reader**, quindi _Java I/O_ e _polimorfismo_.

Creare la classe `ReaderPolimorfico` con relativo JUnit di test `ReaderPolimorficoTest`.

All'interno della classe `ReaderPolimorfico` inserire il seguente metodo:

```java
public String read(Reader rd)
```

### Output

Utilizzare il metodo generico per leggere dati (in formato carattere), che arrivano da:

- String
- char[ ]
- File

Dovranno essere scartati gli eventuali caratteri di fine riga incontrati:

```java
static final char CR = "\r"; // x"0D" Carriage Return
static final char LF = "\n"; // x"0A" Line Feed
```

### Consigli

Per verificare la fine del file utilizzare:

```java
static final int EOF = -1;
```

## Files

**input_file.txt**

```txt
Matteo

Ruggieri
1234
ds
```
