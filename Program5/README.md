# Invoice Queries with Java Streams

A small Java console application that reads invoice data from a text file and performs a set of queries using **Java Streams, lambdas, and comparators**. Built for ITSE 2317 (Intermediate Java Programming).

## What it does
- Reads invoice records from `Program5.txt` and converts each row into an `Invoice` object.
- Uses Streams to run reporting-style queries on the data:
  1. Sort invoices by `partDescription`
  2. Sort invoices by `pricePerItem`
  3. Map to (description, quantity) and sort by quantity
  4. Map to (description, invoiceValue = quantity * pricePerItem) and sort by value
  5. Filter invoice values in the range `$200.00` to `$500.00`
  6. Find an invoice where `partDescription` contains `"Saw"`

## Why I show this project
This project is intentionally small, but it demonstrates practical Java skills that transfer directly to real codebases:
- **Object modeling** (`Invoice`)
- **File I/O and parsing** (reading a text dataset and converting types)
- **Streams & lambdas** (filter/map/sort/collect)
- **Comparator usage** (ordering by different fields)
- **Data transformation** (deriving invoice value from raw fields)

## Project structure
> Adjust paths to match your repo.

- `Program5.java` — entry point (driver)
- `Invoice.java` — data model for a single invoice record
- `StreamRunner.java` — runs the stream queries
- `Program5.txt` — input dataset (CSV-style lines)

## Input format
`Program5.txt` expects one invoice per line:
- partNumber,partDescription,quantity,pricePerItem

Example:
- 83,Hand Saw,4,12.50
- 24,Circular Saw,2,129.99

## How to run

### Compile
```bash
javac *.java

### Run
java Program5

## Notes/Possible Improvements
If extending this beyond the course assignment:
- Use try-with-resources when reading file streams (Files.lines(...)).
- Use groupingBy or a merge function if multiple invoices can share the same description (to avoid toMap key collisions).
- Add unit tests for parsing and query outputs.


---

## How to pitch it in the interview (20 seconds)
If they ask “tell me about a Java project”:

> “One project I like to show is a small invoice query program. It reads invoice data from a file into an `Invoice` model, then uses Java Streams and comparators to generate sorted and filtered reports, including derived values like invoice totals and range filtering. It’s basically a mini data-processing pipeline in Java.”

That lands well for government work because it sounds like internal reporting/data processing—very common.

If you want, paste the `Program5.txt` format (or a few sample lines) and I can suggest one more stream query that looks impressive but is still simple (like top-N by value or grouping totals).
