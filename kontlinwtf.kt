fun readFromFile(filename: String){
    val fieldWidth = 16
    val hexadecimal = 16
    val inFile: FileInputStream
    val data = ByteArray(fieldWidth)                            // A + B
    var total = 0                                               // A

    try {                                                       // C
        var actual: Int
        inFile = FileInputStream(filename)                      // A + B
        while (inFile.available() > 0) {                        // B + C
            var ascii = ""                                      // A
            actual = inFile.read(data)                          // A + B
            total += actual                                     // A
            var size = 0                                        // A
            for (i in 0..actual) {                              // A + C + A
                var text: String                                //
                val temp = data[i].toInt()                      // A + B
                text = Integer.toHexString(temp).toUpperCase()  // A + B + B            ABC = ( 16 + 16 + 11 ) = 25.16
                if (data[i] in 32..127) {                       // C + C
                    ascii += data[i].toChar()                   // A + B
                } else {                                        // C
                    ascii += "."                                // A
                }
                if (temp < hexadecimal) {                       // C
                    print("0")                                  // B
                }
                print("$text ")                                 // B
                if (i == ((fieldWidth / 2) - 1)) {              // C
                    print(" ")                                  // B
                }
                size = i                                        // A
            }
            if (size < fieldWidth / 2) {                        // C
                print(" ")                                      // B
            }
            for (i in size..fieldWidth) {                       // A + C + A
                print(" ")                                      // B
            }
            print(" $ascii")                                    // B
            println()                                           // B
        }
    } catch (exception: IOException) {                          // C
        println(exception)                                      // B
    }
}
