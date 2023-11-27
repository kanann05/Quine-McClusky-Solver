-This is a java program to solve or simplify SOP equation using Quine-McClusky alogrithm.
- Input : Number of Minterms, all the minterms (in decimal), equation variable, four function variables.


- Setup
  I have created four different table classes - table0, table1, table2, table3. These table classes will store the terms at different stages.
  Table0 - Differentiating minterm based on number of 1s.
  Table1 - Grouping 1
  Table 2 - Grouping 2
  Table 3 - Grouping 3
  
  Finding last table - This can be done by iterating from table3 to 0, when an empty table is obtained, the function will stop and store the value of last table.
  
  Adding from prev table - In QM, sometimes not all of the minterms get grouped, hence the terms which were left in previous table, will be added to the set which will undergo final process.

  Implicant table - Graining out the unnecessary terms stored in arraylist by making sure each term has at least one unique minterm number.

  Redcuded implicants - After the above steps, we will need to import the reduced implicants from grainted out terms, this can be done by simply finding one minterm which can't be found in the last batch of terms, 
                        we will then look for that minterm in grainted out terms, if found any, the term will be moved from grained - out to final batch.

  Transforming terms into SOP Terms - to do this, StringBuilders can be used; each position points to one of the variable and if found 1 - variable is to be added, 0 - compliment of variable is to be added, x - variable not to be imported.

  Display - Using above step, and display function, the simplified expression can be displayed.
             Note - [variable] represents that it is compliment of variable.


  
- FUNCTIONING
  Step 1)
        First, the table0 object gets initialized and all the minterms (after being converted to binary) are sorted based on number of 1s.
        Then, all of the terms with same number of 1s will also be stored in a Row class arraylist.
        This Row class arraylist will be helpful to create the next table.
  Step 2)
        Row0 and Row1 is compared and all the terms with 1-bit difference are stored in a new arraylist belonging to table1 class' object.
        This process will go on until there are no more terms left to group.
  Step 3)
        A loop will iterate from table3 to table1 until an empty table object is found. As soon as this happens, one of the variable will store the value of last table which was obtained from this process.
  Step 4)
        A loop will iterate from last table to table0 to make sure all the terms have been grouped, even the ones that don't fit the criterian.
  Step 5)
        An implicant table will be drawn to sort out the final terms. The terms removed, let be rem.
  Step 6)
        A loop will run through all minterms to make sure all the minterms are present in at least one of the last term, if not, the minterm is to be found in any term in rem, when found, that term will be promoted from rem to final terms.
        This will be done for all the minterms that didn't get included.
  Step 7)
        0 - [variable]
        1 - variable
        x - null
        These rules will be followed while converting a term into a SOP simplified form in variables. Each position will point to a variable. No vartiabe can be pointed from two positions and no position can             point to two variables.

  xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx END xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
