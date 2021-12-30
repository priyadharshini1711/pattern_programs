import java.util.*;
public class Name 
{
    int i,j,k,o,o1,o2;
    void a()
    {
        o = 1;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i - 1; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("*");
            } else if (i == 5) {
                for (j = 1; j < o - 2; j++) {
                    System.out.print("*" + " ");
                }
            } else {
                System.out.print("*");
                for (j = 0; j < o; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            if (i >= 1) {
                o = o + 2;
            }
        }        
    }
    void b()
    {
        for (i = 0; i < 9; i++) 
        {
            System.out.print("*");
            if (i == 0 || i == 4 || i == 8) {
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 1 || i == 3 || i == 5 || i == 8) {
                for (j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }        
    }
    void c()
    {
        for (i = 0; i < 9; i++)
        {
            if (i == 0 || i == 8) {
                System.out.print(" " + " " + " ");
                for (j = 0; j < 7; j++) {
                    System.out.print("*");
                }
            }
            if (i == 1 || i == 7) {
                System.out.print(" " + "*");
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void d()
    {
        for (i = 0; i < 9; i++) {
            System.out.print("*");
            if (i == 0 || i == 8) {
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 1 || i == 7) {
                for (j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void e()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0 || i == 4 || i == 8) {
                for (j = 0; j < 9; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void f()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0) {
                for (j = 0; j < 9; j++) {
                    System.out.print("*");
                }
            } else if (i == 4) {
                for (j = 0; j < 8; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
        }        
    }
    void g()
    {
        for (i = 0; i < 9; i++) 
        {
            if (i == 0) {
                System.out.print(" " + " ");
                for (j = 0; j < 6; j++) {
                    System.out.print("*");
                }
            } else if (i == 1) {
                System.out.print(" " + "*");
            } else if (i == 2 || i == 3) {
                System.out.print("*");
            } else if (i == 4) {
                System.out.print("*");
                System.out.print(" " + " " + " ");
                for (i = 0; i < 5; i++) {
                    System.out.print("*");
                }
            } else if (i == 5 || i == 6) {
                System.out.print("*");
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 7) {
                System.out.print(" " + "*");
                for (j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 8) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }        
    }
    void h()
    {
        for (i = 0; i < 9; i++) {
                    for (j = 0; j < 9; j++) {
                        if (j == 0 || j == 8 || i == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        
    }
    void i()
    {
        for (i = 0; i < 9; i++) {
                    for (j = 0; j < 9; j++) {
                        if (i == 0 || i == 8) {
                            System.out.print("*");
                        } else if (j == 4) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        
    }
    void j()
    {
        for (i = 0; i < 9; i++) {
                    for (j = 0; j < 9; j++) {
                        if (i == 0) {
                            System.out.print("*");
                        } else if (j == 4 && i <= 4) {
                            System.out.print("*");
                        } else if ((i > 4 && i < 8) && (j == 0 || j == 4)) {
                            System.out.print("*");
                        } else if (i == 8 && (j == 1 || j == 2 || j == 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        
    }
    void k()
    {
        int l = 1;
                k = 9 / 2;
                for (i = 0; i < 9; i++) {
                    System.out.print("*");
                    if (i < 4) {
                        for (j = 1; j <= k - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    } else {
                        for (j = 1; j <= l; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        l++;
                    }
                    System.out.println();
                }
        
    }
    void l()
    {
        for(i=0;i<9;i++)
        {
            if(i<8)
                System.out.println("*");
            else if(i==8)
            {
                for(i=0;i<9;i++)
                    System.out.print("*");
                break;
            }
        }
        System.out.println();
    }
    void m()
    {
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (j == 0 || j == 8) {
                    System.out.print("*");
                } else if (j >= 1 && j <= 4 && i == j) {
                    System.out.print("*");
                } else if (j >= 5 && j <= 7 && 9 - i - 1 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }        
    }
    void n()
    {
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (j == 0 || j == 8) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }      
    }
    void o()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0 || i == 8) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 1 || i == 7) {
                System.out.print(" " + "*");
                for (j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i >= 2 && i <= 6) {
                System.out.print("*");
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }        
    }
    void p()
    {
        for (i = 0; i < 9; i++) {
            System.out.print("*");
            if (i == 0 || i == 4) {
                for (j = 0; j < 6; j++) {
                    System.out.print("*");
                }
            }
            if (i == 1 || i == 3) {
                for (j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 2) {
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void q()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 1 || i == 7) {
                System.out.print(" " + "*");
                for (j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 2 || i == 3) {
                System.out.print("*");
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i >= 4 && i <= 6) {
                System.out.print("*");
                for (j = 0; j < 7; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
            } else if (i == 8) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
                System.out.print(" " + "*" + "*");
            }

            System.out.println();
        }
        
    }
    void r()
    {
        for (i = 0; i < 9; i++) {
            System.out.print("*");
            if (i == 0 || i == 4) {
                for (j = 0; j < 6; j++) {
                    System.out.print("*");
                }
            }
            if (i == 1 || i == 3) {
                for (j = 0; j < 6; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 2) {
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i >= 5 && i <= 8) {
                for (j = 0; j < 9; j++) {
                    if (i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    void s()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.print(" " + " ");
                for (j = 0; j < 7; j++) {
                    System.out.print("*");
                }
            } else if (i == 1 || i == 3) {
                System.out.print(" " + "*");
            } else if (i == 2) {
                System.out.print("*");
            } else if (i == 4) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            } else if (i == 5 || i == 7) {
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 6) {
                for (j = 0; j < 8; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 8) {
                for (j = 0; j < 7; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }
    void t()
    {
        for (i = 0; i < 9; i++) {
            if (i == 0) {
                for (j = 0; j < 9; j++) {
                    System.out.print("*");
                }
            } else {
                for (j = 0; j < 4; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void u()
    {
        for (i = 0; i < 9; i++) {
            if (i <= 6) {
                System.out.print("*");
                for (j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 7) {
                System.out.print(" " + "*");
                for (j = 0; j < 5; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if (i == 8) {
                System.out.print(" " + " ");
                for (j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }        
    }
    void v()
    {
        o1 = 15;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < o1; j++) {
                System.out.print(" ");
            }
            if (i < 8) {
                System.out.print("*");
            }
            o1 = o1 - 2;
            System.out.println();
        }        
    }
    void w()
    {
        o1 = 15;
        o2 = 1;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == 0) {
                for (j = 0; j < o1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (j = 0; j < o1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                o1 = o1 - 2;
            } else if (i == 8) {
                for (j = 0; j < 15; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else {
                for (j = 0; j < o1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (j = 0; j < o2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (j = 0; j < o1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                o1 = o1 - 2;
                o2 = o2 + 2;
            }
            System.out.println();
        }

    }
    void x()
    {
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (i == j || (9 - i - 1) == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void y()
    {
        for (i = 0; i < 9; i++) {
            if (i < 5) {
                for (j = 0; j < 9; j++) {
                    if (i == j || (9 - i - 1) == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                } else {
                for (j = 0; j < 9; j++) {
                    if ((9 - i - 1) == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    void z()
    {
        for (i = 0; i < 9; i++) {
                    if (i == 0 || i == 8) {
                        for (j = 0; j < 9; j++) {
                            System.out.print("*");
                        }
                    } else {
                        for (j = 1; j < 8; j++) {
                            if ((9 - i - 1) == j) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    System.out.println();        
        }
    }
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        int i, j, k;
        int o, o1, o2;
        Name n= new Name();           
        for (i = 0; i < a.length(); i++) 
        {
            char ch=a.charAt(i);
            switch(ch)
            {
                case 'a':n.a();System.out.println("\n\n\n");break;
                case 'b':n.b();System.out.println("\n\n\n");break;
                case 'c':n.c();System.out.println("\n\n\n");break;
                case 'd':n.d();System.out.println("\n\n\n");break;
                case 'e':n.e();System.out.println("\n\n\n");break;
                case 'f':n.f();System.out.println("\n\n\n");break; 
                case 'g':n.g();System.out.println("\n\n\n");break;
                case 'h':n.h();System.out.println("\n\n\n");break;
                case 'i':n.i();System.out.println("\n\n\n");break;
                case 'j':n.j();System.out.println("\n\n\n");break;
                case 'k':n.k();System.out.println("\n\n\n");break;
                case 'l':n.l();System.out.println("\n\n\n");break;
                case 'm':n.m();System.out.println("\n\n\n");break;
                case 'n':n.n();System.out.println("\n\n\n");break;
                case 'o':n.o();System.out.println("\n\n\n");break;
                case 'p':n.p();System.out.println("\n\n\n");break;
                case 'q':n.q();System.out.println("\n\n\n");break;
                case 'r':n.r();System.out.println("\n\n\n");break;
                case 's':n.s();System.out.println("\n\n\n");break;
                case 't':n.t();System.out.println("\n\n\n");break;
                case 'u':n.u();System.out.println("\n\n\n");break;
                case 'v':n.v();System.out.println("\n\n\n");break;
                case 'w':n.w();System.out.println("\n\n\n");break;
                case 'x':n.x();System.out.println("\n\n\n");break;
                case 'y':n.y();System.out.println("\n\n\n");break;
                case 'z':n.z();System.out.println("\n\n\n");break;
                default:System.out.println("invalid");
            }
        }           
    }
}

/*
ouput1
input: sample
output:
  *******
 *
*
 *
  *****
       *
        *
       *
*******




        *
       * *
      *   *
     *     *
    *       *
   * * * * * * 
  *           *
 *             *
*               *




*       *
**     **
* *   * *
*  * *  *
*   *   *
*       *
*       *
*       *
*       *




******* 
*      *
*       *
*      *
******* 
* 
* 
* 
* 




*
*
*
*
*
*
*
*
*********




*********
*
*
*
*********
*
*
*
*********



output2:
input: space
output:
  *******
 *
*
 *
  *****
       *
        *
       *
*******




******* 
*      *
*       *
*      *
******* 
* 
* 
* 
* 




        *
       * *
      *   *
     *     *
    *       *
   * * * * * * 
  *           *
 *             *
*               *




   ********
 *
*
*
*
*
*
 *
   ********




*********
*
*
*
*********
*
*
*
*********



output3:
input: user
output:
*       *
*       *
*       *
*       *
*       *
*       *
*       *
 *     *
  *****




  *******
 *
*
 *
  *****
       *
        *
       *
*******




*********
*
*
*
*********
*
*
*
*********




******* 
*      *
*       *
*      *
******* 
*     *   
*      *  
*       * 
*        *



*/