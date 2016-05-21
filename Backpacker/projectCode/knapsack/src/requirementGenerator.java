import java.util.*;
import java.io.*;
import java.text.NumberFormat;
public class requirementGenerator{
  public static void main(String[] args){
    int tiny = 10;
    int small = 100;
    int medium = 1000;
    int large = 10000;
    int extraLarge = 100000;
    int huge = 1000000;
    double randomNum1 = 0;
    double randomNum2 = 0;
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    nf.setGroupingUsed(false);

    System.out.print("Starting tinyRequirements...");
    for (int i = 0; i < tiny; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
  			BufferedWriter out = new BufferedWriter(new FileWriter("tinyRequirements.csv", true));
  			out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
  			out.close();
  		}
  		  catch(Exception e){
  		}//catch
    }//for
    System.out.print("done\n");

    System.out.print("Starting smallRequirements...");
    for (int i = 0; i < small; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
        BufferedWriter out = new BufferedWriter(new FileWriter("smallRequirements.csv", true));
        out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
        out.close();
      }
        catch(Exception e){
      }//catch
    }//for
    System.out.print("done\n");

    System.out.print("Starting mediumRequirements...");
    for (int i = 0; i < medium; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
        BufferedWriter out = new BufferedWriter(new FileWriter("mediumRequirements.csv", true));
        out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
        out.close();
      }
        catch(Exception e){
      }//catch
    }//for
    System.out.print("done\n");

    System.out.print("Starting largeRequirements...");
    for (int i = 0; i < large; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
        BufferedWriter out = new BufferedWriter(new FileWriter("largeRequirements.csv", true));
        out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
        out.close();
      }
        catch(Exception e){
      }//catch
    }//for
    System.out.print("done\n");

    System.out.print("Starting extraLargeRequirements...");
    for (int i = 0; i < extraLarge; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
        BufferedWriter out = new BufferedWriter(new FileWriter("extraLargeRequirements.csv", true));
        out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
        out.close();
      }
        catch(Exception e){
      }//catch
    }//for
    System.out.print("done\n");

    System.out.print("Starting hugeRequirements...");
    for (int i = 0; i < huge; i++){
      randomNum1 = Math.random()*100;
      randomNum2 = Math.random()*100;
      try{
        BufferedWriter out = new BufferedWriter(new FileWriter("hugeRequirements.csv", true));
        out.write("item " + (i+1) + ", " + nf.format(randomNum1) + ", " + nf.format(randomNum2) + ", \"item " + (i+1) + "\"\n"); //timing function (response time)
        out.close();
      }
        catch(Exception e){
      }//catch
    }//for
    System.out.print("done\n");


  }
}
