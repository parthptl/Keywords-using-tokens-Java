import java.io.FileReader;

import java.io.IOException;

import java.util.Scanner;

/**

*

* @author Parth Patel

*/

public class N05 {

/**

* @param args the command line arguments

*/

boolean containsWhitespace(String s) {

for (int i = 0; i < s.length(); ++i) {

if (Character.isWhitespace(s.charAt(i))) {

return true;

}

}

return false;

}

public static void main(String ar[]) throws IOException{

String[] d = new String[6];

d[0] = "if";

d[1] = "while";

d[2] = "repeat";

d[3] = "do";

d[4] = "begin";

d[5] = "end";

String[] parth = new String[2];

parth[0] = "=";

parth[1] = ";";

int p = 0;

int a = 0;

int t = 0;

int patel = 0;

int patel2 = 0;

Scanner reader = new Scanner(new FileReader("Input.txt"));

while(reader.hasNext()){

String s = reader.nextLine();

String[] tokens = s.split(" ");

while(t < tokens.length){

a = 0;

while( a < 6 ) {

if(tokens[t].equals(d[a])){

System.out.println("found keyword -> " + tokens[t]);

patel = 1;

}

a++;

}

p = 0;

while( p < 2 ) {

if(tokens[t].equals(parth[p])){

System.out.println("found token -> " + tokens[t]);

patel2 = 1;

}

p++;

}

if (patel2 == 0 && patel == 0){

System.out.println("found identifier -> " + tokens[t]);

}

patel = 0;

patel2 = 0;

t++;

}

}

reader.close();

}

}