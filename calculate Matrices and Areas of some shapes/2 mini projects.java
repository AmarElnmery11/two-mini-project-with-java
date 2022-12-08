package amar.yaser.elnmery;

import java.util.Scanner;
import static java.lang.Math.sqrt;

class shapes {

    Scanner input = new Scanner(System.in);
    private float reduis, base, edge, a, b, c, d, e, f, g, h, i, j, k, l, m;
    final float pi = (22 / 7);

    public void circleArea() {
        System.out.println("enter the circle redius ");
        int as = input.nextInt();
        this.reduis = as;
        System.out.println("the area is : " + (reduis * reduis * pi));
    }

    public void TriangleArea() {
        System.out.println("enter the two dimention of triangle (base then edge)");
        float q = input.nextInt();
        float w = input.nextInt();
        this.base = q;
        this.edge = w;
        float bn = base / 2;
        float high = (float) sqrt((edge * edge) - (bn * bn));
        System.out.println("the are is: " + (bn * high));
    }

    public void SquareArea() {
        System.out.println("enter the edge of square:");
        float p = input.nextFloat();
        this.a = p;
        System.out.println("the area is: " + (a * a));
    }

    public void CuboidArea() {
        System.out.println("enter three dimentions of the cuboid(length,width,high)");
        float q = input.nextFloat();
        float w = input.nextFloat();
        float we = input.nextFloat();
        this.b = q;
        this.c = w;
        this.d = we;
        System.out.println("the area is: " + (2 * (b * c + c * d + d * b)));
    }

    public void cubeArea() {
        System.out.println("enter the edge cube");
        float r = input.nextFloat();
        this.e = r;
        System.out.println("the area is: " + (6 * e * e));
    }

    public void rectangleArea() {
        System.out.println("enter the edges of the rectangle ");
        float r = input.nextFloat();
        float t = input.nextFloat();
        this.f = r;
        this.g = t;
        System.out.println("the area is: " + (f * g));
    }

    public void cylinderArea() {
        System.out.println("enter the radius of circle base then the hight of cylinder ");
        float r = input.nextFloat();
        float t = input.nextFloat();
        this.h = r;
        this.i = t;
        System.out.println("the area is: " + ((2 * pi * h) * (h + i)));
    }

    public void coneArea() {
        System.out.println("enter the radius of circle base then the slant hight ");
        float r = input.nextFloat();
        float t = input.nextFloat();
        this.j = r;
        this.k = t;
        System.out.println("the area is: " + (pi * j * (j + k)));
    }

    public void spherArea() {
        System.out.println("enter the radius of spher ");
        float r = input.nextFloat();
        this.l = r;
        System.out.println("the area is: " + (4 * pi * l * l));
    }

    public void hemispherArea() {
        System.out.println("enter the radius of hemispher ");
        float r = input.nextFloat();
        this.m = r;
        System.out.println("the area is: " + (3 * pi * l * l));
    }
}

class matrixx {

    Scanner input = new Scanner(System.in);
    int z = 3, ee = 3, eee = 3;

    public void multiblication() {
        System.out.println("enter the dimentios of the first matrix");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("enter the first matrix");
        int[][] mat1 = new int[x][y];
        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print("enter the element " + row + " " + col + " :");
                mat1[row][col] = input.nextInt();
            }
        }
        System.out.println("enter the dimention of the second matrix");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("enter the second matrix");
        int[][] mat2 = new int[a][b];
        for (int row = 0; row < a; row++) {
            for (int col = 0; col < b; col++) {
                System.out.print("enter the element " + row + " " + col + " :");
                mat2[row][col] = input.nextInt();
            }
        }
        if (y == a) {
            //multiblication
            int sum = 0;
            int ans[][] = new int[x][b];
            for (int row = 0; row < x; row++) {
                for (int col = 0; col < b; col++) {
                    for (int m = 0; m < y; m++) {
                        sum += mat1[row][m] * mat2[m][col];

                    }
                    ans[row][col] = sum;
                }
            }
            //print   
            System.out.println("The result matrix is:");
            for (int row = 0; row < a; row++) {
                for (int col = 0; col < z; col++) {
                    System.out.print(ans[row][col] + "     ");
                }
                System.out.println();
            }
            System.out.println();
            z = 2;
        } else {
            System.out.println("please enter two matrices that the coloum of the first matrix equai the row of the second matrix ");
            z = 3;
        }
    }

    public void addition() {
        while (ee == 3) {
            System.out.println("enter the dimentios of the first matrix");
            int xx = input.nextInt();
            int yy = input.nextInt();
            System.out.println("enter the first matrix");
            int[][] mat11 = new int[xx][yy];
            for (int row = 0; row < xx; row++) {
                for (int col = 0; col < yy; col++) {
                    System.out.print("enter the element " + row + " " + col + " :");
                    mat11[row][col] = input.nextInt();
                }
            }
            System.out.println("enter the dimentios of the second matrix");
            int aa = input.nextInt();
            int bb = input.nextInt();
            System.out.println("enter the second matrix");
            int[][] mat22 = new int[aa][bb];
            for (int row = 0; row < aa; row++) {
                for (int col = 0; col < bb; col++) {
                    System.out.print("enter the element " + row + " " + col + " :");
                    mat22[row][col] = input.nextInt();
                }
            }
            if (xx == aa & yy == bb) {
                // addition
                int anss[][] = new int[xx][bb];
                for (int row = 0; row < xx; row++) {
                    for (int col = 0; col < yy; col++) {
                        anss[row][col] = mat11[row][col] + mat22[row][col];
                    }
                }
                //print   
                System.out.println("The result matrix is:");
                for (int row = 0; row < xx; row++) {
                    for (int col = 0; col < yy; col++) {
                        System.out.print(anss[row][col] + "   ");
                    }
                    System.out.println();
                }
                System.out.println();
                ee = 2;
            } else {
                System.out.println("please enter two equal matrices in dimention");
                ee = 3;
            }
        }
    }

    public void abstraction() {
        while (eee == 3) {
            System.out.println("enter the dimentios of the first matrix");
            int xxx = input.nextInt();
            int yyy = input.nextInt();
            System.out.println("enter the first matrix");
            int[][] mat111 = new int[xxx][yyy];
            for (int row = 0; row < xxx; row++) {
                for (int col = 0; col < yyy; col++) {
                    System.out.print("enter the element " + row + " " + col + " :");
                    mat111[row][col] = input.nextInt();
                }
            }
            System.out.println("enter the dimention of the second matrix");
            int aaa = input.nextInt();
            int bbb = input.nextInt();
            System.out.println("enter the second matrix");
            int[][] mat222 = new int[aaa][bbb];
            for (int row = 0; row < aaa; row++) {
                for (int col = 0; col < bbb; col++) {
                    System.out.print("enter the element " + row + " " + col + " :");
                    mat222[row][col] = input.nextInt();
                }
            }
            if (xxx == aaa & yyy == bbb) {
                // subtraction
                int ansss[][] = new int[xxx][yyy];
                for (int row = 0; row < xxx; row++) {
                    for (int col = 0; col < yyy; col++) {
                        ansss[row][col] = mat111[row][col] - mat222[row][col];
                    }
                }
                //print  
                System.out.println("The result matrix is:");
                for (int row = 0; row < xxx; row++) {
                    for (int col = 0; col < yyy; col++) {
                        System.out.print(ansss[row][col] + "  ");
                    }

                    System.out.println();
                }
                System.out.println();
                eee = 2;
            } else {
                System.out.println("please enter two equal matrices in dimention");
                eee = 3;
            }
        }
    }
}

public class AmarYaserElnmery {

    public static void main(String[] args) {
        shapes obj = new shapes();
        matrixx obj2 = new matrixx();
        Scanner input = new Scanner(System.in);
        int i = 1,hh=1,hhh=1;
        while (i != 3) {
            System.out.println("if you want to calculate the shape area enter 1  ifelse you need calculate tow matrices enter 2 ifelse you want to end the program enter 3");
            i = input.nextInt();
            if (i == 1) {
              while(hh==1){
                System.out.println("choose the shape \nif the shape is squar enter 1\nif the shape is cubiod enter 2 ");
                System.out.println("if the shape is tiangle enter 3\nif the shape is circle enter 4\nif the shape is cube inter 5");
                System.out.println("if the shape is rectangle enter 6\nif the shape is cylinder enter 7\nif the shape is cone enter 8");
                System.out.println("if the shape is spher enter 9\nif the shape is hemispher enter 10");
                int x = input.nextInt();
                switch (x) {
                    case (1):
                        obj.SquareArea();
                        hh=2;
                        break;
                    case (2):
                        obj.CuboidArea();
                        hh=2;
                        break;
                    case (3):
                        obj.TriangleArea();
                        hh=2;
                        break;
                    case (4):
                        obj.circleArea();
                        hh=2;
                        break;
                    case (5):
                        obj.cubeArea();
                        hh=2;
                        break;
                    case (6):
                        obj.rectangleArea();
                        hh=2;
                        break;
                    case (7):
                        obj.cylinderArea();
                        hh=2;
                        break;
                    case (8):
                        obj.coneArea();
                        hh=2;
                        break;
                    case (9):
                        obj.spherArea();
                        hh=2;
                        break;
                    case (10):
                        obj.hemispherArea();
                        hh=2;
                        break;
                    default:
                        System.out.println("please enter the right number");
                        hh=1;
                }
              }
            } /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (i == 2) {
                while (hhh == 1) {
                    System.out.println("if you want to calculate mulitiplication enter 1\nifelse you want to calculate the addition enter 2\nifelse you want to calculate the subtraction enter 3");
                    int zz = input.nextInt();

                    switch (zz) {
                        case (1):
                            obj2.multiblication();
                            hhh = 2;
                            break;
                        case (2):
                            obj2.addition();
                            hhh = 2;
                            break;
                        case (3):
                            obj2.abstraction();
                            hhh = 2;
                            break;
                        default:
                            System.out.println("please enter right number");
                            hhh = 1;
                    }
                }

            } 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (i == 3) {
                System.out.println("The programe is end ");
                break;
            } ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////\\
            else {
                System.out.println("please enter the right input");
            }
        }
    }
}
