          Scanner stdIn = new Scanner(System.in);

                System.out.println("BMI<82>�<8c>v<8e>Z");

                System.out.print("<81>E<90>g<92>�(m)<82>�<93>�<97>�<82>�<82>�<82>�<82>�<82>�<82>�<81>F");
                double height = stdIn.nextDouble();
                System.out.print("<81>E<91>�<8f>d(Kg)<82>�<93>�<97>�<82>�<82>�<82>�<82>�<82>�<82>�<81>F");

                double weight = stdIn.nextDouble();

                double bmi = weight / Math.pow(height, 2);

                System.out.println("BMI<92>l<82>�" + (Math.floor(bmi*100))/100);

              }
            }


