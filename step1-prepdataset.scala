// Stanford TMT Example 0 - Basic data loading
// http://nlp.stanford.edu/software/tmt/0.4/

import scalanlp.io._;

val johnadams = CSVFile("johnadams-no-dups.csv");

println("Success: " + johnadams + " contains " + johnadams.data.size + " records");