
import javax.net.ssl.SSLEngineResult;
import java.util.*;


public class Main {


    static class Table0 {


        static class row_tab0 {
            int no_of_ones;
            int decNum;
            StringBuilder binNum = new StringBuilder();


            row_tab0(int ones, int dec, StringBuilder bin) {
                this.no_of_ones = ones;
                this.decNum = dec;
                this.binNum = bin;
            }
        }


        static ArrayList<row_tab0> rows0 = new ArrayList<>();
        static ArrayList<row_tab0> rows1 = new ArrayList<>();
        static ArrayList<row_tab0> rows2 = new ArrayList<>();
        static ArrayList<row_tab0> rows3 = new ArrayList<>();
        static ArrayList<row_tab0> rows4 = new ArrayList<>();
        public static void createRows() {
            for(int i = 0; i<all_mints_bin.size(); i++) {


                int tot_ones = 0;
                for(int j = 0; j<4; j++) {
                    if(all_mints_bin.get(i).charAt(j) == '1') {
                        tot_ones++;
                    }
                }


                row_tab0 Row = new row_tab0(tot_ones, all_mints_dec.get(i), all_mints_bin.get(i));


                if(tot_ones == 0) {
                    rows0.add(Row);
                }
                else if (tot_ones==1) {
                    rows1.add(Row);
                }
                else if (tot_ones==2) {
                    rows2.add(Row);
                }
                else if (tot_ones==3) {
                    rows3.add(Row);
                }
                else {
                    rows4.add(Row);
                }
            }
        }


        public static void displayTable0() {


            System.out.println(" Arrangement based on no. of ones\nNo. of ones Dec Num Bin Num");
            for(int i = 0; i<rows0.size(); i++) {
                System.out.print(rows0.get(i).no_of_ones + " " + rows0.get(i).decNum + " " + rows0.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows1.size(); i++) {
                System.out.print(rows1.get(i).no_of_ones + " " + rows1.get(i).decNum + " " + rows1.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows2.size(); i++) {
                System.out.print(rows2.get(i).no_of_ones + " " + rows2.get(i).decNum + " " + rows2.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows3.size(); i++) {
                System.out.print(rows3.get(i).no_of_ones + " " + rows3.get(i).decNum + " " + rows3.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows4.size(); i++) {
                System.out.print(rows4.get(i).no_of_ones + " " + rows4.get(i).decNum + " " + rows4.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");
        }


    }


    static class Table1 {


        static class row_tab1 {
            int no_of_ones;
            int decNum1;
            int decNum2;
            StringBuilder binNum;
            row_tab1(int ones, int dec1, int dec2, StringBuilder bin) {
                this.no_of_ones = ones;
                this.decNum1 = dec1;
                this.decNum2 = dec2;
                this.binNum = bin;
            }
        }


        static ArrayList<Table1.row_tab1> rows0_t1 = new ArrayList<>();
        static ArrayList<Table1.row_tab1> rows1_t1 = new ArrayList<>();
        static ArrayList<Table1.row_tab1> rows2_t1 = new ArrayList<>();
        static ArrayList<Table1.row_tab1> rows3_t1 = new ArrayList<>();


        public static void createRows() {


            for (int i = 0; i < table0.rows0.size(); i++) {
                for (int j = 0; j < table0.rows1.size(); j++) {
                    int samezies = 0;
                    StringBuilder bin = new StringBuilder();


                    for (int k = 0; k < 4; k++) {
                        if (table0.rows0.get(i).binNum.charAt(k) == table0.rows1.get(j).binNum.charAt(k)) {
                            samezies++;
                            bin.append(table0.rows0.get(i).binNum.charAt(k));
                        } else {
                            bin.append('x');
                        }
                    }


                    if (samezies == 3) {
                        row_tab1 row = new row_tab1(table0.rows0.get(i).no_of_ones, table0.rows0.get(i).decNum, table0.rows1.get(j).decNum, bin);
                        rows0_t1.add(row);
                    }
                }
            }


            for (int i = 0; i < table0.rows1.size(); i++) {
                for (int j = 0; j < table0.rows2.size(); j++) {
                    int samezies = 0;
                    StringBuilder bin = new StringBuilder();


                    for (int k = 0; k < 4; k++) {
                        if (table0.rows1.get(i).binNum.charAt(k) == table0.rows2.get(j).binNum.charAt(k)) {
                            samezies++;
                            bin.append(table0.rows1.get(i).binNum.charAt(k));
                        } else {
                            bin.append('x');
                        }
                    }


                    if (samezies == 3) {
                        row_tab1 row = new row_tab1(table0.rows1.get(i).no_of_ones, table0.rows1.get(i).decNum, table0.rows2.get(j).decNum, bin);
                        rows1_t1.add(row);
                    }
                }
            }


            for (int i = 0; i < table0.rows2.size(); i++) {
                for (int j = 0; j < table0.rows3.size(); j++) {
                    int samezies = 0;
                    StringBuilder bin = new StringBuilder();


                    for (int k = 0; k < 4; k++) {
                        if (table0.rows2.get(i).binNum.charAt(k) == table0.rows3.get(j).binNum.charAt(k)) {
                            samezies++;
                            bin.append(table0.rows2.get(i).binNum.charAt(k));
                        } else {
                            bin.append('x');
                        }
                    }


                    if (samezies == 3) {
                        row_tab1 row = new row_tab1(table0.rows2.get(i).no_of_ones, table0.rows2.get(i).decNum, table0.rows3.get(j).decNum, bin);
                        rows2_t1.add(row);
                    }
                }
            }


            for (int i = 0; i < table0.rows3.size(); i++) {
                for (int j = 0; j < table0.rows4.size(); j++) {
                    int samezies = 0;
                    StringBuilder bin = new StringBuilder();


                    for (int k = 0; k < 4; k++) {
                        if (table0.rows3.get(i).binNum.charAt(k) == table0.rows4.get(j).binNum.charAt(k)) {
                            samezies++;
                            bin.append(table0.rows3.get(i).binNum.charAt(k));
                        } else {
                            bin.append('x');
                        }
                    }


                    if (samezies == 3) {
                        row_tab1 row = new row_tab1(table0.rows3.get(i).no_of_ones, table0.rows3.get(i).decNum, table0.rows4.get(j).decNum, bin);
                        rows3_t1.add(row);
                    }
                }
            }
        }


        public void displayTable1() {
            System.out.println(" Grouping - 1\nNo. of ones Dec Num Bin Num");
            for(int i = 0; i<rows0_t1.size(); i++) {
                System.out.print(rows0_t1.get(i).no_of_ones + " " + rows0_t1.get(i).decNum1 + ", " + rows0_t1.get(i).decNum2 + " " + rows0_t1.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows1_t1.size(); i++) {
                System.out.print(rows1_t1.get(i).no_of_ones + " " + rows1_t1.get(i).decNum1 + ", " + rows1_t1.get(i).decNum2 + " " + rows1_t1.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows2_t1.size(); i++) {
                System.out.print(rows2_t1.get(i).no_of_ones + " " + rows2_t1.get(i).decNum1 + ", " + rows2_t1.get(i).decNum2 + " " + rows2_t1.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");


            for(int i = 0; i<rows3_t1.size(); i++) {
                System.out.print(rows3_t1.get(i).no_of_ones + " " + rows3_t1.get(i).decNum1 + ", " + rows3_t1.get(i).decNum2 + " " + rows3_t1.get(i).binNum );
                System.out.println();
            }
            System.out.println("----------------------------------------------");
        }


    }


    static class Table2 {
        static class row_tab2 {
            int no_of_ones;
            int decNum1, decNum2, decNum3, decNum4;
            StringBuilder binNum;


            row_tab2(int ones, int dec1, int dec2, int dec3, int dec4, StringBuilder binary) {
                this.no_of_ones = ones;
                this.decNum1 = dec1;
                this.decNum2 = dec2;;
                this.decNum3 = dec3;
                this.decNum4 = dec4;
                this.binNum = binary;
            }
        }


        static ArrayList<Table2.row_tab2> rows0_t2 = new ArrayList<>();
        static ArrayList<Table2.row_tab2> rows1_t2 = new ArrayList<>();
        static ArrayList<Table2.row_tab2> rows2_t2 = new ArrayList<>();


        public static void createRows() {


            for(int i = 0; i < table1.rows0_t1.size(); i++ ) {
                for (int j = 0; j<table1.rows1_t1.size(); j++) {
                    StringBuilder bin = new StringBuilder();
                    int sameziess = 0;
                    for(int k = 0; k<4; k++) {
                        if(table1.rows0_t1.get(i).binNum.charAt(k) == table1.rows1_t1.get(j).binNum.charAt(k) ) {
                            bin.append(table1.rows0_t1.get(i).binNum.charAt(k));
                            sameziess++;
                        }
                        else {
                            bin.append('x');
                        }
                    }


                    if(sameziess == 3) {
                        row_tab2 row = new row_tab2(table1.rows0_t1.get(i).no_of_ones, table1.rows0_t1.get(i).decNum1, table1.rows0_t1.get(i).decNum2, table1.rows1_t1.get(j).decNum1, table1.rows1_t1.get(j).decNum2, bin);
                        rows0_t2.add(row);
                    }
                }
            }


            for(int i = 0; i < table1.rows1_t1.size(); i++ ) {
                for (int j = 0; j<table1.rows2_t1.size(); j++) {
                    StringBuilder bin = new StringBuilder();
                    int sameziess = 0;
                    for(int k = 0; k<4; k++) {
                        if(table1.rows1_t1.get(i).binNum.charAt(k) == table1.rows2_t1.get(j).binNum.charAt(k) ) {
                            bin.append(table1.rows1_t1.get(i).binNum.charAt(k));
                            sameziess++;
                        }
                        else {
                            bin.append('x');
                        }
                    }


                    if(sameziess == 3) {
                        row_tab2 row = new row_tab2(table1.rows1_t1.get(i).no_of_ones, table1.rows1_t1.get(i).decNum1, table1.rows1_t1.get(i).decNum2, table1.rows2_t1.get(j).decNum1, table1.rows2_t1.get(j).decNum2, bin);
                        rows1_t2.add(row);
                    }
                }
            }


            for(int i = 0; i < table1.rows2_t1.size(); i++ ) {
                for (int j = 0; j<table1.rows3_t1.size(); j++) {
                    StringBuilder bin = new StringBuilder();
                    int sameziess = 0;
                    for(int k = 0; k<4; k++) {
                        if(table1.rows2_t1.get(i).binNum.charAt(k) == table1.rows3_t1.get(j).binNum.charAt(k) ) {
                            bin.append(table1.rows2_t1.get(i).binNum.charAt(k));
                            sameziess++;
                        }
                        else {
                            bin.append('x');
                        }
                    }


                    if(sameziess == 3) {
                        row_tab2 row = new row_tab2(table1.rows2_t1.get(i).no_of_ones, table1.rows2_t1.get(i).decNum1, table1.rows2_t1.get(i).decNum2, table1.rows3_t1.get(j).decNum1, table1.rows3_t1.get(j).decNum2, bin);
                        rows2_t2.add(row);
                    }
                }
            }
        }


        public static void displayTable2() {
            System.out.println(" Grouping - 2\nNo. of ones Dec Num Bin Num");
            for(int i = 0; i<rows0_t2.size(); i++) {


                System.out.print(rows0_t2.get(i).no_of_ones + " " + rows0_t2.get(i).decNum1 + ", " + rows0_t2.get(i).decNum2 + ", " + rows0_t2.get(i).decNum3 + ", " + rows0_t2.get(i).decNum4 + " " + rows0_t2.get(i).binNum );
                System.out.println();
            }
            System.out.println("-----------------------------------------------------");


            for(int i = 0; i<rows1_t2.size(); i++) {
                System.out.print(rows1_t2.get(i).no_of_ones + " " + rows1_t2.get(i).decNum1 + ", " + rows1_t2.get(i).decNum2 + ", " + rows1_t2.get(i).decNum3 + ", " + rows1_t2.get(i).decNum4 + " " + rows1_t2.get(i).binNum );
                System.out.println();
            }
            System.out.println("-----------------------------------------------------");


            for(int i = 0; i<rows2_t2.size(); i++) {
                System.out.print(rows2_t2.get(i).no_of_ones + " " + rows2_t2.get(i).decNum1 + ", " + rows2_t2.get(i).decNum2 + ", " + rows2_t2.get(i).decNum3 + ", " + rows2_t2.get(i).decNum4 + " " + rows2_t2.get(i).binNum );
                System.out.println();
            }
            System.out.println("-----------------------------------------------------");
        }
    }


    static class Table3 {


        static class row_tab3 {
            int no_of_ones;
            int decNum1, decNum2, decNum3, decNum4, decNum5, decNum6, decNum7, decNum8;


            StringBuilder binNum;


            row_tab3(int ones, int dec1, int dec2, int dec3, int dec4, int dec5, int dec6, int dec7, int dec8, StringBuilder binary) {
                this.no_of_ones = ones;
                this.decNum1 = dec1;
                this.decNum2 = dec2;
                ;
                this.decNum3 = dec3;
                this.decNum4 = dec4;
                this.decNum5 = dec5;
                this.decNum6 = dec6;
                ;
                this.decNum7 = dec7;
                this.decNum8 = dec8;
                this.binNum = binary;
            }
        }


        static ArrayList<Table3.row_tab3> rows0_t3 = new ArrayList<>();
        static ArrayList<Table3.row_tab3> rows1_t3 = new ArrayList<>();


        public static void createRows() {


            for (int i = 0; i < table2.rows0_t2.size(); i++) {
                for (int j = 0; j < table2.rows1_t2.size(); j++) {
                    StringBuilder bin = new StringBuilder();
                    int sameziess = 0;
                    for (int k = 0; k < 4; k++) {
                        if (table2.rows0_t2.get(i).binNum.charAt(k) == table2.rows1_t2.get(j).binNum.charAt(k)) {
                            bin.append(table2.rows0_t2.get(i).binNum.charAt(k));
                            sameziess++;
                        } else {
                            bin.append('x');
                        }
                    }


                    if (sameziess == 3) {
                        row_tab3 row = new row_tab3(table2.rows0_t2.get(i).no_of_ones, table2.rows0_t2.get(i).decNum1, table2.rows0_t2.get(i).decNum2, table2.rows0_t2.get(i).decNum3, table2.rows0_t2.get(i).decNum4, table2.rows1_t2.get(j).decNum1, table2.rows1_t2.get(j).decNum2, table2.rows1_t2.get(j).decNum3, table2.rows1_t2.get(j).decNum4, bin);
                        rows0_t3.add(row);
                    }
                }
            }


            for (int i = 0; i < table2.rows1_t2.size(); i++) {
                for (int j = 0; j < table2.rows2_t2.size(); j++) {
                    StringBuilder bin = new StringBuilder();
                    int sameziess = 0;
                    for (int k = 0; k < 4; k++) {
                        if (table2.rows1_t2.get(i).binNum.charAt(k) == table2.rows2_t2.get(j).binNum.charAt(k)) {
                            bin.append(table2.rows1_t2.get(i).binNum.charAt(k));
                            sameziess++;
                        } else {
                            bin.append('x');
                        }
                    }


                    if (sameziess == 3) {
                        row_tab3 row = new row_tab3(table2.rows1_t2.get(i).no_of_ones, table2.rows1_t2.get(i).decNum1, table2.rows1_t2.get(i).decNum2, table2.rows1_t2.get(i).decNum3, table2.rows1_t2.get(i).decNum4, table2.rows2_t2.get(j).decNum1, table2.rows2_t2.get(j).decNum2, table2.rows2_t2.get(j).decNum3, table2.rows2_t2.get(j).decNum4, bin);
                        rows0_t3.add(row);
                    }
                }
            }
        }


        public static void displayTable3() {
            System.out.println(" Grouping - 3\nNo. of ones Dec Num Bin Num");
            for(int i = 0; i<rows0_t3.size(); i++) {
                System.out.println(rows0_t3.get(i).no_of_ones + " " + rows0_t3.get(i).decNum1 + ", " + rows0_t3.get(i).decNum2 + ", " + rows0_t3.get(i).decNum3+ ", " +rows0_t3.get(i).decNum4 + ", " + rows0_t3.get(i).decNum5 + ", " + rows0_t3.get(i).decNum6 + ", " + rows0_t3.get(i).decNum7 + ", " + rows0_t3.get(i).decNum8 + " " + rows0_t3.get(i).binNum );
            }
            System.out.println("---------------------------------------------------------------------------------------------");
            for(int i = 0; i<rows1_t3.size(); i++) {
                System.out.println(rows1_t3.get(i).no_of_ones + " " + rows1_t3.get(i).decNum1 + ", " + rows1_t3.get(i).decNum2 + ", " + rows1_t3.get(i).decNum3+ ", " +rows1_t3.get(i).decNum4 + ", " + rows1_t3.get(i).decNum5 + ", " + rows1_t3.get(i).decNum6 + ", " + rows1_t3.get(i).decNum7 + ", " + rows1_t3.get(i).decNum8 + " " + rows1_t3.get(i).binNum );
            }
        }
    }


    static class mainTerms{


        ArrayList<Integer> decNums = new ArrayList<>();
        StringBuilder binNum;


        mainTerms(StringBuilder binary) {
            this.binNum = binary;
        }


    }


    public static Table0 table0 = new Table0();


    public static Table1 table1 = new Table1();


    public static Table2 table2 = new Table2();


    public static Table3 table3 = new Table3();
    public static ArrayList<Integer> all_mints_dec = new ArrayList<>();
    public static ArrayList<StringBuilder> all_mints_bin = new ArrayList<>();


    public static int tablePtr= 0;
    public static void findLastTable() {




        if(table3.rows0_t3.size() != 0 || table3.rows1_t3.size() != 0) {
            tablePtr = 3;
            System.out.println();
            table0.displayTable0();


            System.out.println();
            table1.displayTable1();


            System.out.println();
            table2.displayTable2();


            System.out.println();
            table3.displayTable3();


        }
        else {
            if( table2.rows0_t2.size() != 0 || table2.rows1_t2.size() != 0 || table2.rows2_t2.size() != 0 ) {
                tablePtr = 2;
                System.out.println();
                table0.displayTable0();


                System.out.println();
                table1.displayTable1();


                System.out.println();
                table2.displayTable2();
            }
            else {
                if(table1.rows0_t1.size() != 0 || table1.rows1_t1.size() != 0 || table1.rows2_t1.size() != 0 || table1.rows3_t1.size() != 0 ) {
                    tablePtr = 1;
                    System.out.println();
                    table0.displayTable0();


                    System.out.println();
                    table1.displayTable1();
                }
                else {
                    tablePtr = 0;
                    System.out.println();
                    table0.displayTable0();
                }
            }
        }
    }


    public static void add_from() {
        if(tablePtr == 3) {
            add_from_3();
            check_in_3();
            check_in_2();
            check_in_1();
        }
        else if(tablePtr == 2) {
            add_from_2();
            check_in_2();
            check_in_1();
        }
        else if(tablePtr == 1) {
            add_from_1();
            check_in_1();
        }
        else {
            add_from_0();
        }
        removeDups();
    }


    public static void add_from_3() {
        for(int i = 0; i<table3.rows0_t3.size(); i++) {
            mainTerms maine = new mainTerms(table3.rows0_t3.get(i).binNum);


            maine.decNums.add(table3.rows0_t3.get(i).decNum1);
            maine.decNums.add(table3.rows0_t3.get(i).decNum2);
            maine.decNums.add(table3.rows0_t3.get(i).decNum3);
            maine.decNums.add(table3.rows0_t3.get(i).decNum4);
            maine.decNums.add(table3.rows0_t3.get(i).decNum5);
            maine.decNums.add(table3.rows0_t3.get(i).decNum6);
            maine.decNums.add(table3.rows0_t3.get(i).decNum7);
            maine.decNums.add(table3.rows0_t3.get(i).decNum8);


            main_terms.add(maine);
        }


        for(int i = 0; i<table3.rows1_t3.size(); i++) {
            mainTerms maine = new mainTerms(table3.rows1_t3.get(i).binNum);


            maine.decNums.add(table3.rows1_t3.get(i).decNum1);
            maine.decNums.add(table3.rows1_t3.get(i).decNum2);
            maine.decNums.add(table3.rows1_t3.get(i).decNum3);
            maine.decNums.add(table3.rows1_t3.get(i).decNum4);
            maine.decNums.add(table3.rows1_t3.get(i).decNum5);
            maine.decNums.add(table3.rows1_t3.get(i).decNum6);
            maine.decNums.add(table3.rows1_t3.get(i).decNum7);
            maine.decNums.add(table3.rows1_t3.get(i).decNum8);


            main_terms.add(maine);
        }
    }


    public static void add_from_2() {
        for (int i = 0; i < table2.rows0_t2.size(); i++) {
            mainTerms maine = new mainTerms(table2.rows0_t2.get(i).binNum);


            maine.decNums.add(table2.rows0_t2.get(i).decNum1);
            maine.decNums.add(table2.rows0_t2.get(i).decNum2);
            maine.decNums.add(table2.rows0_t2.get(i).decNum3);
            maine.decNums.add(table2.rows0_t2.get(i).decNum4);


            main_terms.add(maine);
        }


        for (int i = 0; i < table2.rows1_t2.size(); i++) {
            mainTerms maine = new mainTerms(table2.rows1_t2.get(i).binNum);


            maine.decNums.add(table2.rows1_t2.get(i).decNum1);
            maine.decNums.add(table2.rows1_t2.get(i).decNum2);
            maine.decNums.add(table2.rows1_t2.get(i).decNum3);
            maine.decNums.add(table2.rows1_t2.get(i).decNum4);


            main_terms.add(maine);
        }


        for (int i = 0; i < table2.rows2_t2.size(); i++) {
            mainTerms maine = new mainTerms(table2.rows2_t2.get(i).binNum);


            maine.decNums.add(table2.rows2_t2.get(i).decNum1);
            maine.decNums.add(table2.rows2_t2.get(i).decNum2);
            maine.decNums.add(table2.rows2_t2.get(i).decNum3);
            maine.decNums.add(table2.rows2_t2.get(i).decNum4);


            main_terms.add(maine);
        }
    }


    public static void add_from_1() {
        for(int i = 0; i<table1.rows0_t1.size(); i++) {
            mainTerms maine = new mainTerms(table1.rows0_t1.get(i).binNum);


            maine.decNums.add(table1.rows0_t1.get(i).decNum1);
            maine.decNums.add(table1.rows0_t1.get(i).decNum1);


            main_terms.add(maine);
        }


        for(int i = 0; i<table1.rows1_t1.size(); i++) {
            mainTerms maine = new mainTerms(table1.rows1_t1.get(i).binNum);


            maine.decNums.add(table1.rows1_t1.get(i).decNum1);
            maine.decNums.add(table1.rows1_t1.get(i).decNum1);


            main_terms.add(maine);
        }


        for(int i = 0; i<table1.rows2_t1.size(); i++) {
            mainTerms maine = new mainTerms(table1.rows2_t1.get(i).binNum);


            maine.decNums.add(table1.rows2_t1.get(i).decNum1);
            maine.decNums.add(table1.rows2_t1.get(i).decNum1);


            main_terms.add(maine);
        }


        for(int i = 0; i<table1.rows3_t1.size(); i++) {
            mainTerms maine = new mainTerms(table1.rows3_t1.get(i).binNum);


            maine.decNums.add(table1.rows3_t1.get(i).decNum1);
            maine.decNums.add(table1.rows3_t1.get(i).decNum1);


            main_terms.add(maine);
        }
    }


    public static void add_from_0() {
        for(int i = 0; i<table0.rows0.size(); i++) {
            mainTerms maine = new mainTerms(table0.rows0.get(i).binNum);


            maine.decNums.add(table0.rows0.get(i).decNum);


            main_terms.add(maine);
        }


        for(int i = 0; i<table0.rows1.size(); i++) {
            mainTerms maine = new mainTerms(table0.rows1.get(i).binNum);


            maine.decNums.add(table0.rows1.get(i).decNum);


            main_terms.add(maine);
        }


        for(int i = 0; i<table0.rows2.size(); i++) {
            mainTerms maine = new mainTerms(table0.rows2.get(i).binNum);


            maine.decNums.add(table0.rows2.get(i).decNum);


            main_terms.add(maine);
        }


        for(int i = 0; i<table0.rows3.size(); i++) {
            mainTerms maine = new mainTerms(table0.rows3.get(i).binNum);


            maine.decNums.add(table0.rows3.get(i).decNum);


            main_terms.add(maine);
        }


        for(int i = 0; i<table0.rows4.size(); i++) {
            mainTerms maine = new mainTerms(table0.rows4.get(i).binNum);


            maine.decNums.add(table0.rows4.get(i).decNum);


            main_terms.add(maine);
        }
    }


    public static void check_in_3() {
        HashSet<Integer> decs_included = new HashSet<>();


//adding all decs in t3
        for (int i = 0; i < main_terms.size(); i++) {
            for (int j = 0; j < 8; j++) {
                if (decs_included.contains(main_terms.get(i).decNums.get(j))) {
                    continue;
                } else {
                    decs_included.add(main_terms.get(i).decNums.get(j));
                }
            }
        }


//checking what decs are not included in t3 and adding them in a new arrlist
        ArrayList<Integer> decs_not_included_t3 = new ArrayList<>();
        for (int i = 0; i < all_mints_dec.size(); i++) {
            if (decs_included.contains(all_mints_dec.get(i))) {
                continue;
            } else {
                decs_not_included_t3.add(all_mints_dec.get(i));
            }
        }


//adding terms from t2
        if (decs_not_included_t3.size() != 0) {
//searching t2
            for (int i = 0; i < decs_not_included_t3.size(); i++) {
                for (int j = 0; j < table2.rows0_t2.size(); j++) {
                    if (table2.rows0_t2.get(j).decNum1 == decs_not_included_t3.get(i) || table2.rows0_t2.get(j).decNum2 == decs_not_included_t3.get(i) || table2.rows0_t2.get(j).decNum3 == decs_not_included_t3.get(i) || table2.rows0_t2.get(j).decNum4 == decs_not_included_t3.get(i)) {
                        mainTerms maine = new mainTerms(table2.rows0_t2.get(j).binNum);


                        maine.decNums.add(table2.rows0_t2.get(j).decNum1);
                        maine.decNums.add(table2.rows0_t2.get(j).decNum2);
                        maine.decNums.add(table2.rows0_t2.get(j).decNum3);
                        maine.decNums.add(table2.rows0_t2.get(j).decNum4);


                        main_terms.add(maine);
// System.out.println(table2.rows0_t2.get(j).binNum);
                    }
                }


                for (int j = 0; j < table2.rows1_t2.size(); j++) {
                    if (table2.rows1_t2.get(j).decNum1 == decs_not_included_t3.get(i) || table2.rows1_t2.get(j).decNum2 == decs_not_included_t3.get(i) || table2.rows1_t2.get(j).decNum3 == decs_not_included_t3.get(i) || table2.rows1_t2.get(j).decNum4 == decs_not_included_t3.get(i)) {
                        mainTerms maine = new mainTerms(table2.rows0_t2.get(j).binNum);


                        maine.decNums.add(table2.rows1_t2.get(j).decNum1);
                        maine.decNums.add(table2.rows1_t2.get(j).decNum2);
                        maine.decNums.add(table2.rows1_t2.get(j).decNum3);
                        maine.decNums.add(table2.rows1_t2.get(j).decNum4);


                        main_terms.add(maine);
// System.out.println(table2.rows1_t2.get(j).binNum);
                    }
                }


                for (int j = 0; j < table2.rows2_t2.size(); j++) {
                    if (table2.rows2_t2.get(j).decNum1 == decs_not_included_t3.get(i) || table2.rows2_t2.get(j).decNum2 == decs_not_included_t3.get(i) || table2.rows2_t2.get(j).decNum3 == decs_not_included_t3.get(i) || table2.rows2_t2.get(j).decNum4 == decs_not_included_t3.get(i)) {


                        mainTerms maine = new mainTerms(table2.rows2_t2.get(j).binNum);


                        maine.decNums.add(table2.rows2_t2.get(j).decNum1);
                        maine.decNums.add(table2.rows2_t2.get(j).decNum2);
                        maine.decNums.add(table2.rows2_t2.get(j).decNum3);
                        maine.decNums.add(table2.rows2_t2.get(j).decNum4);


                        main_terms.add(maine);
                    }
                }
            }
        }
    }


    public static void check_in_2() {
        HashSet<Integer> decs_included = new HashSet<>();


// Combine all rows into a single list or collection (assuming table2.rows0_t2, table2.rows1_t2, table2.rows2_t2 are of the same type)
        List<Table2.row_tab2> allRows = new ArrayList<>();
        allRows.addAll(table2.rows0_t2);
        allRows.addAll(table2.rows1_t2);
        allRows.addAll(table2.rows2_t2);


// Iterate through all rows and add unique decNum values
        for (Table2.row_tab2 row : allRows) {
            decs_included.add(row.decNum1);
            decs_included.add(row.decNum2);
            decs_included.add(row.decNum3);
            decs_included.add(row.decNum4);
        }


        ArrayList<Integer> not_included = new ArrayList<>();


        for (int i = 0; i < all_mints_dec.size(); i++) {
            if (decs_included.contains(all_mints_dec.get(i))) {
                continue;
            } else {
                not_included.add(all_mints_dec.get(i));
            }
        }


// for (int i = 0; i < not_included.size(); i++) {
// System.out.println(not_included.get(i));
// }


//adding from 1
        if (not_included.size() != 0) {
            for (int i = 0; i < not_included.size(); i++) {
                for (int j = 0; j < table1.rows0_t1.size(); j++) {
                    if (table1.rows0_t1.get(j).decNum1 == not_included.get(i) || table1.rows0_t1.get(j).decNum2 == not_included.get(i)) {
                        mainTerms maine = new mainTerms(table1.rows0_t1.get(j).binNum);
                        maine.decNums.add(table1.rows0_t1.get(j).decNum1);
                        maine.decNums.add(table1.rows0_t1.get(j).decNum2);


                        main_terms.add(maine);
                    }
                }


                for (int j = 0; j < table1.rows1_t1.size(); j++) {
                    if (table1.rows1_t1.get(j).decNum1 == not_included.get(i) || table1.rows1_t1.get(j).decNum2 == not_included.get(i)) {
                        mainTerms maine = new mainTerms(table1.rows1_t1.get(j).binNum);
                        maine.decNums.add(table1.rows1_t1.get(j).decNum1);
                        maine.decNums.add(table1.rows1_t1.get(j).decNum2);


                        main_terms.add(maine);
                    }
                }


                for (int j = 0; j < table1.rows2_t1.size(); j++) {
                    if (table1.rows2_t1.get(j).decNum1 == not_included.get(i) || table1.rows2_t1.get(j).decNum2 == not_included.get(i)) {
                        mainTerms maine = new mainTerms(table1.rows2_t1.get(j).binNum);
                        maine.decNums.add(table1.rows2_t1.get(j).decNum1);
                        maine.decNums.add(table1.rows2_t1.get(j).decNum2);


                        main_terms.add(maine);


                    }
                }


                for (int j = 0; j < table1.rows3_t1.size(); j++) {
                    if (table1.rows3_t1.get(j).decNum1 == not_included.get(i) || table1.rows3_t1.get(j).decNum2 == not_included.get(i)) {
                        mainTerms maine = new mainTerms(table1.rows3_t1.get(j).binNum);
                        maine.decNums.add(table1.rows3_t1.get(j).decNum1);
                        maine.decNums.add(table1.rows3_t1.get(j).decNum2);


                        main_terms.add(maine);


                    }
                }
            }
        }
    }




    public static void check_in_1() {
        HashSet<Integer> decs_included = new HashSet<>();


//checking t1
        List<Table1.row_tab1> allRows = new ArrayList<>();
        allRows.addAll(table1.rows0_t1);
        allRows.addAll(table1.rows1_t1);
        allRows.addAll(table1.rows2_t1);
        allRows.addAll(table1.rows3_t1);


        for(Table1.row_tab1 row: allRows) {
            decs_included.add(row.decNum1);
            decs_included.add(row.decNum2);
        }


        ArrayList<Integer> decs_not_included = new ArrayList<>();
        for(int i = 0; i<all_mints_dec.size(); i++) {
            if(decs_included.contains(all_mints_dec.get(i))) {
                continue;
            }
            else {
                decs_included.add(all_mints_dec.get(i));
            }
        }


//adding from t0
        for(int i = 0; i<all_mints_dec.size(); i++) {
            if(decs_not_included.contains(all_mints_dec.get(i))) {
                StringBuilder binary = all_mints_bin.get(i);
                mainTerms maine = new mainTerms(binary);
                maine.decNums.add(all_mints_dec.get(i));
                main_terms.add(maine);
            }
        }
    }
    public static void removeDups() {
        HashSet<String> final_binary_terms = new HashSet<>();
        ArrayList<mainTerms> newarr = new ArrayList<>();


        for(int i = 0; i<main_terms.size(); i++) {
            String binn = main_terms.get(i).binNum.toString();


            if(final_binary_terms.contains(binn)) {
                continue;
            }
            else {
                newarr.add(main_terms.get(i));
                final_binary_terms.add(binn);
            }
        }
        main_terms.clear();
        main_terms.addAll(newarr);
    }


    public static void declutter() {
        ArrayList<Integer> all_good_decs = new ArrayList<>();
        ArrayList<Integer> all_bad_decs = new ArrayList<>();
        ArrayList<Integer> all_decs = new ArrayList<>();


//finding all dec positions being used by main_terms
        for(int i = 0; i<main_terms.size(); i++) {
            for(int j = 0; j<main_terms.get(i).decNums.size(); j++) {
                if(all_decs.contains(main_terms.get(i).decNums.get(j))) {
                    continue;
                }
                else {
                    all_decs.add(main_terms.get(i).decNums.get(j));
                }
            }
        }


//finding unique minterms
        for(int i = 0; i<main_terms.size(); i++) {
            int dec_size = main_terms.get(i).decNums.size();
            for(int j = 0; j<dec_size; j++) {
                if (all_bad_decs.contains(main_terms.get(i).decNums.get(j))) {
                    continue;
                }
                else if(all_good_decs.contains(main_terms.get(i).decNums.get(j))) {
                    all_bad_decs.add(main_terms.get(i).decNums.get(j));
                    all_good_decs.remove(main_terms.get(i).decNums.get(j));
                }
                else {
                    all_good_decs.add(main_terms.get(i).decNums.get(j));
                }
            }
        }






//finding elements who have a unique minterm.


        ArrayList<mainTerms> not_unique_terms = new ArrayList<>();


        for(int j = 0; j<main_terms.size(); j++) {
            boolean uni = false;
            for(int k = 0; k< main_terms.get(j).decNums.size(); k++) {
                if(all_good_decs.contains(main_terms.get(j).decNums.get(k))) {
                    uni = true;
                    all_good_decs.remove(main_terms.get(j).decNums.get(k));
                    for(int l = 0; l<main_terms.get(j).decNums.size(); l++) {
                        if(all_decs.contains(main_terms.get(j).decNums.get(l))) {
                            all_decs.remove(main_terms.get(j).decNums.get(l));
                        }
                    }
                }
            }
            if(uni==true) {
                main_unique_terms.add(main_terms.get(j).binNum);
            }
            else {
                not_unique_terms.add(main_terms.get(j));
            }
        }




//reduced prime implicant table
// System.out.println(all_decs.size());
        if(all_decs.size()!=0) {
            for(int i = 0; i<all_decs.size(); i++) {
                ArrayList<StringBuilder> binary = new ArrayList<>();
                for (int j = 0; j<not_unique_terms.size(); j++) {
                    for(int k = 0; k<not_unique_terms.get(j).decNums.size(); k++) {
                        if(not_unique_terms.get(j).decNums.get(k) == all_decs.get(i)) {
                            binary.add(not_unique_terms.get(j).binNum);
                        }
                    }
                }
                int xess = 0;
                int largest = 0;
                for(int l = 0; l<binary.size(); l++) {
                    if(l==0) {
                        xess = xes(binary.get(l));
                    }
                    else {
                        int temp = xes(binary.get(l));
                        if(temp>xess) {
                            xess = temp;
                        }
                    }
                }
                for(int m = 0; m<binary.size(); m++) {
                    if(xes(binary.get(m)) == xess) {
                        main_unique_terms.add(binary.get(m));
                        break;
                    }
                }


            }
        }
    }


    public static int xes(StringBuilder str) {
        int xs = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'x') {
                xs++;
            }
        }
        return xs;
    }


    public static void bin_to_vars() {
        for(int i = 0; i<main_unique_terms.size(); i++) {
            StringBuilder bin_to_var = new StringBuilder();
            for(int j = 0; j<main_unique_terms.get(i).length(); j++) {
                if(main_unique_terms.get(i).charAt(j) == 'x') {
                    bin_to_var.append("");
                }
                else if(main_unique_terms.get(i).charAt(j) == '1') {
                    bin_to_var.append(vars.get(j));
                }
                else {
                    bin_to_var.append("[");
                    bin_to_var.append(vars.get(j));
                    bin_to_var.append("]");
                }
            }
            terms_in_vars.add(bin_to_var);
        }
    }


// public static char refer(int n) {
// if(n==0) {
// return vars.get(n);
// }
// else if (n==1) {
// return vars.get(1);
// }
// }


    public static ArrayList<Character> vars = new ArrayList<>();


    public static ArrayList<StringBuilder> terms_in_vars = new ArrayList<>();
    public static ArrayList<mainTerms> main_terms = new ArrayList<>();
    public static ArrayList<StringBuilder> main_unique_terms = new ArrayList<>();
    public static int minTs = 0;


    public static void decToBin (int decNum) {


        StringBuilder mint_bin = new StringBuilder();


        while(decNum > 0) {
            int quot = decNum/2;
            int remainder = decNum%2;


            if(remainder == 1) {
                mint_bin.append('1');
            }
            else {
                mint_bin.append('0');
            }


            decNum = quot;
        }


        while (mint_bin.length() != 4) {
            mint_bin.append('0');
        }


        mint_bin.reverse();
        all_mints_bin.add(mint_bin);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("\n 4-bit Quine-McClusky solver\n");


        System.out.println("How many minterms are there?");
        minTs = sc.nextInt();
        if(minTs == 16) {
            System.out.println("For 16 minterms, the equation automatically comes out to be 0.");
        }


        System.out.println("Enter distinct minterms.");
        for (int i = 0; i < minTs; i++) {
            int decNum = sc.nextInt();
            decToBin(decNum);
            all_mints_dec.add(decNum);


        }


        System.out.println("Enter equation variable.");
        char eq_var = sc.next().charAt(0);


        System.out.println("Enter the four variables.");
        for(int i = 0; i<4; i++) {
            vars.add(sc.next().charAt(0));
        }


        table0.createRows();


        table1.createRows();


        table2.createRows();


        table3.createRows();










// System.out.println(table3.rows0_t3.size());
        findLastTable();
        add_from();
// System.out.println(tablePtr);
// removeDups();


// for (int i = 0; i < main_terms.size(); i++) {
// System.out.println(main_terms.get(i).binNum);
// }
        declutter();


// for (int i = 0; i < main_unique_terms.size(); i++) {
// System.out.println(main_unique_terms.get(i));
// }


        System.out.println("Note - The variable with [ ] around it represents ― above it.\n\n");


        bin_to_vars();
        System.out.print(eq_var + " = ");
        for(int i = 0; i<terms_in_vars.size(); i++) {
            if(i == terms_in_vars.size() -1) {
                System.out.print(terms_in_vars.get(i));
            }
            else {
                System.out.print(terms_in_vars.get(i) + " + ");
            }
        }
    }
}

