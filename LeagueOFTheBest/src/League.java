import java.util.*;
import java.io.*;

public class League {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(new FileReader("football.txt"));
		
		String[] a = new String[12];
		
		for(int i = 0; sc.hasNext(); i++)
			a[i] = sc.nextLine();
		
		String s = in.next();
		if(!s.equals("Y") && !s.equals("y")){
			System.out.println("Good Luck!");
			return;
		}
		
		int win[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int draw[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int lose[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int pts[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int GF[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int GA[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int x = (int) (Math.random() * 7);
		int y = (int) (Math.random() * 7);
		
		System.out.println("Week 1 :");
		
		System.out.println(a[8] + " " + "-" + " " + a[11] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[11]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[11]++;
			lose[8]++;
			pts[11] += 3;
		}
		else{
			draw[8]++;
			draw[11]++;
			pts[8]++;
			pts[11]++;
		}
		GF[8] += x;
		GF[11] += y;
		GA[8] += y;
		GA[11] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[5] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[5]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[5]++;
			lose[3]++;
			pts[5] += 3;
		}
		else{
			draw[3]++;
			draw[5]++;
			pts[3]++;
			pts[5]++;
		}
		GF[3] += x;
		GF[5] += y;
		GA[3] += y;
		GA[5] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[1]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[2]++;
			pts[1] += 3;
		}
		else{
			draw[2]++;
			draw[1]++;
			pts[2]++;
			pts[1]++;
		}
		GF[2] += x;
		GF[1] += y;
		GA[2] += y;
		GA[1] += x;
		
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[4]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[9]++;
			pts[4] += 3;
		}
		else{
			draw[9]++;
			draw[4]++;
			pts[9]++;
			pts[4]++;
		}
		GF[9] += x;
		GF[4] += y;
		GA[9] += y;
		GA[4 ] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[10]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[0]++;
			pts[10] += 3;
		}
		else{
			draw[0]++;
			draw[10]++;
			pts[0]++;
			pts[10]++;
		}
		GF[0] += x;
		GF[10] += y;
		GA[0] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[6]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[7]++;
			pts[6] += 3;
		}
		else{
			draw[7]++;
			draw[6]++;
			pts[7]++;
			pts[6]++;
		}
		GF[7] += x;
		GF[6] += y;
		GA[7] += y;
		GA[6] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 2 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[6] + " " + "-" + " " + a[3] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[6]++;
			lose[3]++;
			pts[6] += 3;
		}
		else if(x < y){
			win[3]++;
			lose[6]++;
			pts[3] += 3;
		}
		else{
			draw[6]++;
			draw[3]++;
			pts[6]++;
			pts[3]++;
		}
		GF[6] += x;
		GF[3] += y;
		GA[6] += y;
		GA[3] += x;
		
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[4]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[7]++;
			pts[4] += 3;
		}
		else{
			draw[7]++;
			draw[4]++;
			pts[7]++;
			pts[4]++;
		}
		GF[7] += x;
		GF[4] += y;
		GA[7] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[8] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[8]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[8]++;
			lose[5]++;
			pts[8] += 3;
		}
		else{
			draw[5]++;
			draw[8]++;
			pts[5]++;
			pts[8]++;
		}
		GF[5] += x;
		GF[8] += y;
		GA[5] += y;
		GA[8] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[9] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[9]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[9]++;
			lose[2]++;
			pts[9] += 3;
		}
		else{
			draw[2]++;
			draw[9]++;
			pts[2]++;
			pts[9]++;
		}
		GF[2] += x;
		GF[9] += y;
		GA[2] += y;
		GA[9] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[10] + " " + "-" + " " + a[11] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[10]++;
			lose[11]++;
			pts[10] += 3;
		}
		else if(x < y){
			win[11]++;
			lose[10]++;
			pts[11] += 3;
		}
		else{
			draw[10]++;
			draw[11]++;
			pts[10]++;
			pts[11]++;
		}
		GF[10] += x;
		GF[11] += y;
		GA[10] += y;
		GA[11] += x;
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[1]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[0]++;
			pts[1] += 3;
		}
		else{
			draw[0]++;
			draw[1]++;
			pts[0]++;
			pts[1]++;
		}
		GF[0] += x;
		GF[1] += y;
		GA[0] += y;
		GA[1] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 3 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[8] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[8]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[8]++;
			lose[7]++;
			pts[8] += 3;
		}
		else{
			draw[7]++;
			draw[8]++;
			pts[7]++;
			pts[8]++;
		}
		GF[7] += x;
		GF[8] += y;
		GA[7] += y;
		GA[8] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[0] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[0]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[0]++;
			lose[11]++;
			pts[0] += 3;
		}
		else{
			draw[11]++;
			draw[0]++;
			pts[11]++;
			pts[0]++;
		}
		GF[11] += x;
		GF[0] += y;
		GA[11] += y;
		GA[0] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[1] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[1]++;
			lose[6]++;
			pts[1] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[1]++;
			pts[6] += 3;
		}
		else{
			draw[1]++;
			draw[6]++;
			pts[1]++;
			pts[6]++;
		}
		GF[1] += x;
		GF[6] += y;
		GA[1] += y;
		GA[6] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[10]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[9]++;
			pts[10] += 3;
		}
		else{
			draw[9]++;
			draw[10]++;
			pts[9]++;
			pts[10]++;
		}
		GF[9] += x;
		GF[10] += y;
		GA[9] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[4]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[3]++;
			pts[4] += 3;
		}
		else{
			draw[3]++;
			draw[4]++;
			pts[3]++;
			pts[4]++;
		}
		GF[3] += x;
		GF[4] += y;
		GA[3] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[5] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[5]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[5]++;
			lose[2]++;
			pts[5] += 3;
		}
		else{
			draw[2]++;
			draw[5]++;
			pts[2]++;
			pts[5]++;
		}
		GF[2] += x;
		GF[5] += y;
		GA[2] += y;
		GA[5] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 4 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[10] + " " + "-" + " " + a[5] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[10]++;
			lose[5]++;
			pts[10] += 3;
		}
		else if(x < y){
			win[5]++;
			lose[10]++;
			pts[5] += 3;
		}
		else{
			draw[10]++;
			draw[5]++;
			pts[10]++;
			pts[5]++;
		}
		GF[10] += x;
		GF[5] += y;
		GA[10] += y;
		GA[5] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[8] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[8]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[8]++;
			lose[3]++;
			pts[8] += 3;
		}
		else{
			draw[3]++;
			draw[8]++;
			pts[10]++;
			pts[5]++;
		}
		GF[10] += x;
		GF[5] += y;
		GA[10] += y;
		GA[5] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[7] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[7]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[7]++;
			lose[2]++;
			pts[7] += 3;
		}
		else{
			draw[2]++;
			draw[7]++;
			pts[2]++;
			pts[7]++;
		}
		GF[2] += x;
		GF[7] += y;
		GA[2] += y;
		GA[7] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[9] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[9]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[9]++;
			lose[0]++;
			pts[9] += 3;
		}
		else{
			draw[0]++;
			draw[9]++;
			pts[0]++;
			pts[9]++;
		}
		GF[0] += x;
		GF[9] += y;
		GA[0] += y;
		GA[9] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[1] + " " + "-" + " " + a[11] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[1]++;
			lose[11]++;
			pts[1] += 3;
		}
		else if(x < y){
			win[9]++;
			lose[1]++;
			pts[9] += 3;
		}
		else{
			draw[0]++;
			draw[9]++;
			pts[2]++;
			pts[7]++;
		}
		GF[0] += x;
		GF[9] += y;
		GA[0] += y;
		GA[9] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[6] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[6]++;
			lose[4]++;
			pts[6] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[6]++;
			pts[4] += 3;
		}
		else{
			draw[6]++;
			draw[4]++;
			pts[6]++;
			pts[4]++;
		}
		GF[6] += x;
		GF[4] += y;
		GA[6] += y;
		GA[4] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 5 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[0] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[0]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[0]++;
			lose[5]++;
			pts[0] += 3;
		}
		else{
			draw[5]++;
			draw[0]++;
			pts[5]++;
			pts[0]++;
		}
		GF[6] += x;
		GF[4] += y;
		GA[6] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[4]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[8]++;
			pts[4] += 3;
		}
		else{
			draw[8]++;
			draw[4]++;
			pts[8]++;
			pts[4]++;
		}
		GF[8] += x;
		GF[4] += y;
		GA[8] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[2] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[2]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[2]++;
			lose[3]++;
			pts[2] += 3;
		}
		else{
			draw[3]++;
			draw[2]++;
			pts[3]++;
			pts[2]++;
		}
		GF[3] += x;
		GF[2] += y;
		GA[3] += y;
		GA[2] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[10]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[7]++;
			pts[10] += 3;
		}
		else{
			draw[7]++;
			draw[10]++;
			pts[7]++;
			pts[10]++;
		}
		GF[7] += x;
		GF[10] += y;
		GA[7] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[6]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[11]++;
			pts[6] += 3;
		}
		else{
			draw[11]++;
			draw[6]++;
			pts[11]++;
			pts[6]++;
		}
		GF[11] += x;
		GF[6] += y;
		GA[11] += y;
		GA[6] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[1]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[9]++;
			pts[1] += 3;
		}
		else{
			draw[9]++;
			draw[1]++;
			pts[9]++;
			pts[1]++;
		}
		GF[9] += x;
		GF[1] += y;
		GA[9] += y;
		GA[1] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 6 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[10]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[3]++;
			pts[10] += 3;
		}
		else{
			draw[3]++;
			draw[10]++;
			pts[3]++;
			pts[10]++;
		}
		GF[3] += x;
		GF[10] += y;
		GA[3] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[1]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[5]++;
			pts[1] += 3;
		}
		else{
			draw[5]++;
			draw[1]++;
			pts[5]++;
			pts[1]++;
		}
		GF[5] += x;
		GF[1] += y;
		GA[5] += y;
		GA[1] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[4]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[2]++;
			pts[4] += 3;
		}
		else{
			draw[2]++;
			draw[4]++;
			pts[2]++;
			pts[4]++;
		}
		GF[2] += x;
		GF[4] += y;
		GA[2] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[11] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[11]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[11]++;
			lose[9]++;
			pts[11] += 3;
		}
		else{
			draw[9]++;
			draw[11]++;
			pts[9]++;
			pts[11]++;
		}
		GF[9] += x;
		GF[11] += y;
		GA[9] += y;
		GA[11] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[0] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[0]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[0]++;
			lose[7]++;
			pts[0] += 3;
		}
		else{
			draw[7]++;
			draw[0]++;
			pts[7]++;
			pts[0]++;
		}
		GF[7] += x;
		GF[0] += y;
		GA[7] += y;
		GA[0] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[6]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[8]++;
			pts[6] += 3;
		}
		else{
			draw[8]++;
			draw[6]++;
			pts[8]++;
			pts[6]++;
		}
		GF[8] += x;
		GF[6] += y;
		GA[8] += y;
		GA[6] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 7 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[6]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[9]++;
			pts[6] += 3;
		}
		else{
			draw[9]++;
			draw[6]++;
			pts[9]++;
			pts[6]++;
		}
		GF[9] += x;
		GF[6] += y;
		GA[9] += y;
		GA[6] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[1]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[7]++;
			pts[1] += 3;
		}
		else{
			draw[7]++;
			draw[1]++;
			pts[7]++;
			pts[1]++;
		}
		GF[7] += x;
		GF[1] += y;
		GA[7] += y;
		GA[1] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[11] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[11]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[11]++;
			lose[5]++;
			pts[11] += 3;
		}
		else{
			draw[5]++;
			draw[11]++;
			pts[5]++;
			pts[11]++;
		}
		GF[5] += x;
		GF[11] += y;
		GA[5] += y;
		GA[11] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[2] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[2]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[2]++;
			lose[8]++;
			pts[2] += 3;
		}
		else{
			draw[8]++;
			draw[2]++;
			pts[8]++;
			pts[2]++;
		}
		GF[8] += x;
		GF[2] += y;
		GA[8] += y;
		GA[2] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[4] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[4]++;
			lose[10]++;
			pts[4] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[4]++;
			pts[10] += 3;
		}
		else{
			draw[4]++;
			draw[10]++;
			pts[4]++;
			pts[10]++;
		}
		GF[4] += x;
		GF[10] += y;
		GA[4] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[3] + " " + "-" + " " + a[0] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[3]++;
			lose[0]++;
			pts[3] += 3;
		}
		else if(x < y){
			win[0]++;
			lose[3]++;
			pts[0] += 3;
		}
		else{
			draw[3]++;
			draw[0]++;
			pts[3]++;
			pts[0]++;
		}
		GF[3] += x;
		GF[0] += y;
		GA[3] += y;
		GA[0] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 8 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[10] + " " + "-" + " " + a[8] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[10]++;
			lose[8]++;
			pts[10] += 3;
		}
		else if(x < y){
			win[8]++;
			lose[10]++;
			pts[8] += 3;
		}
		else{
			draw[10]++;
			draw[8]++;
			pts[10]++;
			pts[8]++;
		}
		GF[10] += x;
		GF[8] += y;
		GA[10] += y;
		GA[8] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[4]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[0]++;
			pts[4] += 3;
		}
		else{
			draw[0]++;
			draw[4]++;
			pts[0]++;
			pts[4]++;
		}
		GF[0] += x;
		GF[4] += y;
		GA[0] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[1] + " " + "-" + " " + a[3] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[1]++;
			lose[3]++;
			pts[1] += 3;
		}
		else if(x < y){
			win[3]++;
			lose[1]++;
			pts[3] += 3;
		}
		else{
			draw[1]++;
			draw[3]++;
			pts[1]++;
			pts[3]++;
		}
		GF[1] += x;
		GF[3] += y;
		GA[1] += y;
		GA[3] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[7] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[7]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[7]++;
			lose[11]++;
			pts[7] += 3;
		}
		else{
			draw[11]++;
			draw[7]++;
			pts[11]++;
			pts[7]++;
		}
		GF[11] += x;
		GF[7] += y;
		GA[11] += y;
		GA[7] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[5] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[5]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[5]++;
			lose[9]++;
			pts[5] += 3;
		}
		else{
			draw[9]++;
			draw[5]++;
			pts[9]++;
			pts[5]++;
		}
		GF[9] += x;
		GF[5] += y;
		GA[9] += y;
		GA[5] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[6]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[2]++;
			pts[6] += 3;
		}
		else{
			draw[2]++;
			draw[6]++;
			pts[2]++;
			pts[6]++;
		}
		GF[2] += x;
		GF[6] += y;
		GA[2] += y;
		GA[6] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 9 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[3] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[3]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[3]++;
			lose[11]++;
			pts[3] += 3;
		}
		else{
			draw[11]++;
			draw[3]++;
			pts[11]++;
			pts[3]++;
		}
		GF[11] += x;
		GF[3] += y;
		GA[11] += y;
		GA[3] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[2] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[2]++;
			lose[10]++;
			pts[2] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[2]++;
			pts[10] += 3;
		}
		else{
			draw[2]++;
			draw[10]++;
			pts[2]++;
			pts[10]++;
		}
		GF[2] += x;
		GF[10] += y;
		GA[2] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[6]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[5]++;
			pts[6] += 3;
		}
		else{
			draw[5]++;
			draw[6]++;
			pts[5]++;
			pts[6]++;
		}
		GF[5] += x;
		GF[6] += y;
		GA[5] += y;
		GA[6] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[9] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[9]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[9]++;
			lose[7]++;
			pts[9] += 3;
		}
		else{
			draw[7]++;
			draw[9]++;
			pts[7]++;
			pts[9]++;
		}
		GF[7] += x;
		GF[9] += y;
		GA[7] += y;
		GA[9] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[4] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[4]++;
			lose[1]++;
			pts[4] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[4]++;
			pts[1] += 3;
		}
		else{
			draw[4]++;
			draw[1]++;
			pts[4]++;
			pts[1]++;
		}
		GF[3] += x;
		GF[1] += y;
		GA[4] += y;
		GA[1] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[0] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[0]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[0]++;
			lose[8]++;
			pts[0] += 3;
		}
		else{
			draw[8]++;
			draw[0]++;
			pts[8]++;
			pts[0]++;
		}
		GF[8] += x;
		GF[0] += y;
		GA[8] += y;
		GA[0] += x;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Week 10 :");
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[2] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[2]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[2]++;
			lose[0]++;
			pts[2] += 3;
		}
		else{
			draw[0]++;
			draw[2]++;
			pts[0]++;
			pts[2]++;
		}
		GF[0] += x;
		GF[2] += y;
		GA[0] += y;
		GA[2] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[1] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[1]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[1]++;
			lose[8]++;
			pts[1] += 3;
		}
		else{
			draw[8]++;
			draw[1]++;
			pts[8]++;
			pts[1]++;
		}
		GF[8] += x;
		GF[1] += y;
		GA[8] += y;
		GA[1] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[4]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[11]++;
			pts[4] += 3;
		}
		else{
			draw[11]++;
			draw[4]++;
			pts[11]++;
			pts[4]++;
		}
		GF[11] += x;
		GF[4] += y;
		GA[11] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[9] + " " + "-" + " " + a[3] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[9]++;
			lose[3]++;
			pts[9] += 3;
		}
		else if(x < y){
			win[3]++;
			lose[9]++;
			pts[3] += 3;
		}
		else{
			draw[9]++;
			draw[3]++;
			pts[9]++;
			pts[3]++;
		}
		GF[9] += x;
		GF[4] += y;
		GA[9] += y;
		GA[3] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[5] + " " + "-" + " " + a[7] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[7]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[7]++;
			lose[5]++;
			pts[7] += 3;
		}
		else{
			draw[5]++;
			draw[7]++;
			pts[5]++;
			pts[7]++;
		}
		GF[5] += x;
		GF[7] += y;
		GA[5] += y;
		GA[7] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[6] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[6]++;
			lose[10]++;
			pts[6] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[6]++;
			pts[10] += 3;
		}
		else{
			draw[6]++;
			draw[10]++;
			pts[6]++;
			pts[10]++;
		}
		GF[6] += x;
		GF[10] += y;
		GA[6] += y;
		GA[10] += x;
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Week 11 :");
		
		System.out.println(a[5] + " " + "-" + " " + a[4] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[5]++;
			lose[4]++;
			pts[5] += 3;
		}
		else if(x < y){
			win[4]++;
			lose[5]++;
			pts[4] += 3;
		}
		else{
			draw[5]++;
			draw[4]++;
			pts[5]++;
			pts[4]++;
		}
		GF[5] += x;
		GF[4] += y;
		GA[5] += y;
		GA[4] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[11] + " " + "-" + " " + a[2] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[11]++;
			lose[2]++;
			pts[11] += 3;
		}
		else if(x < y){
			win[2]++;
			lose[11]++;
			pts[2] += 3;
		}
		else{
			draw[11]++;
			draw[2]++;
			pts[11]++;
			pts[2]++;
		}
		GF[11] += x;
		GF[2] += y;
		GA[11] += y;
		GA[2] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[1] + " " + "-" + " " + a[10] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[1]++;
			lose[10]++;
			pts[1] += 3;
		}
		else if(x < y){
			win[10]++;
			lose[1]++;
			pts[10] += 3;
		}
		else{
			draw[1]++;
			draw[10]++;
			pts[1]++;
			pts[10]++;
		}
		GF[1] += x;
		GF[10] += y;
		GA[1] += y;
		GA[10] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[7] + " " + "-" + " " + a[3] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[7]++;
			lose[3]++;
			pts[7] += 3;
		}
		else if(x < y){
			win[3]++;
			lose[7]++;
			pts[3] += 3;
		}
		else{
			draw[7]++;
			draw[3]++;
			pts[7]++;
			pts[3]++;
		}
		GF[7] += x;
		GF[3] += y;
		GA[7] += y;
		GA[3] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[8] + " " + "-" + " " + a[9] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[8]++;
			lose[9]++;
			pts[8] += 3;
		}
		else if(x < y){
			win[9]++;
			lose[8]++;
			pts[9] += 3;
		}
		else{
			draw[8]++;
			draw[9]++;
			pts[8]++;
			pts[7]++;
		}
		GF[8] += x;
		GF[9] += y;
		GA[8] += y;
		GA[9] += x;
		
		x = (int) (Math.random() * 7);
		y = (int) (Math.random() * 7);
		
		System.out.println(a[0] + " " + "-" + " " + a[6] + "," + " " + x + "-" + y);
		
		if(x > y){
			win[0]++;
			lose[6]++;
			pts[0] += 3;
		}
		else if(x < y){
			win[6]++;
			lose[0]++;
			pts[6] += 3;
		}
		else{
			draw[0]++;
			draw[6]++;
			pts[0]++;
			pts[6]++;
		}
		GF[0] += x;
		GF[6] += y;
		GA[0] += y;
		GA[6] += x;
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 12; i++){ 
			for(int j = i + 1; j < 12; j++) { 
				if(pts[i] < pts[j]){ 
					int sort = pts[j]; 
					pts[j] = pts[i]; 
					pts[i] = sort; 
					sort = win[j]; 
					win[j] = win[i]; 
					win[i] = sort; 
					sort = draw[j]; 
					draw[j] = draw[i]; 
					draw[i] = sort; 
					sort = lose[j]; 
					lose[j] = lose[i]; 
					lose[i] = sort; 
					sort = GF[j]; 
					GF[j] = GF[i]; 
					GF[i] = sort; 
					sort = GA[j]; 
					GA[j] = GA[i]; 
					GA[i] = sort; 
					s = a[i]; 
					a[i] = a[j]; 
					a[j] = s; 
				} 
				else if(pts[i] == pts[j] && win[i] < win[j]) { 
					int sort = pts[j]; 
					pts[j] = pts[i]; 
					pts[i] = sort; 
					sort = win[j]; 
					win[j] = win[i]; 
					win[i] = sort; 
					sort = draw[j]; 
					draw[j] = draw[i]; 
					draw[i] = sort; 
					sort = lose[j]; 
					lose[j] = lose[i]; 
					lose[i] = sort; 
					sort = GF[j]; 
					GF[j] = GF[i]; 
					GF[i] = sort; 
					sort = GA[j]; 
					GA[j] = GA[i]; 
					GA[i] = sort; 
					s = a[i]; 
					a[i] = a[j]; 
					a[j] = s; 
				} 
				else if(pts[i] == pts[j] && win[i] == win[j] && (GF[i]-GA[i]) < (GF[j] - GA[j])) { 
					int sort = pts[j]; 
					pts[j] = pts[i]; 
					pts[i] = sort; 
					sort = win[j]; 
					win[j] = win[i]; 
					win[i] = sort; 
					sort = draw[j]; 
					draw[j] = draw[i]; 
					draw[i] = sort; 
					sort = lose[j]; 
					lose[j] = lose[i]; 
					lose[i] = sort; 
					sort = GF[j]; 
					GF[j] = GF[i]; 
					GF[i] = sort; 
					sort = GA[j]; 
					GA[j] = GA[i]; 
					GA[i] = sort; 
					s = a[i]; 
					a[i] = a[j]; 
					a[j] = s; 
				} 
				else if(pts[i] == pts[j] && (GF[i] - GA[i]) == (GF[j] - GA[j]) && GF[i] < GF[j]) { 
					int sort = pts[j]; 
					pts[j] = pts[i]; 
					pts[i] = sort; 
					sort = win[j]; 
					win[j] = win[i]; 
					win[i] = sort; 
					sort = draw[j]; 
					draw[j] = draw[i]; 
					draw[i] = sort; 
					sort = lose[j]; 
					lose[j] = lose[i]; 
					lose[i] = sort; 
					sort = GF[j]; 
					GF[j] = GF[i]; 
					GF[i] = sort; 
					sort = GA[j]; 
					GA[j] = GA[i]; 
					GA[i] = sort; 
					s = a[i]; 
					a[i] = a[j]; 
					a[j] = s; 
				} 
			}		 
		}
			
		System.out.println("Final Table");
		System.out.println("#" + " " + "Team" + " " + "W" + " " + "D" + " " + "L" + " " + "GF" + " " + "GA" + " " + "GD" + " " + "PTS");
		for(int i = 0; i < 12; i++){
		System.out.println((i + 1) + " " + a[i] + " " + win[i] + " " + draw[i] + " " + lose[i] + " " + GF[i] + " " + GA[i] + " " + (GF[i]- GA[i]) + " " + pts[i]);
		}
	}

}
