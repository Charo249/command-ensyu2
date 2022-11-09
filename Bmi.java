          Scanner stdIn = new Scanner(System.in);

                System.out.println("BMI<82>Ì<8c>v<8e>Z");

                System.out.print("<81>E<90>g<92>·(m)<82>ð<93>ü<97>Í<82>µ<82>Ä<82>­<82>¾<82>³<82>¢<81>F");
                double height = stdIn.nextDouble();
                System.out.print("<81>E<91>Ì<8f>d(Kg)<82>ð<93>ü<97>Í<82>µ<82>Ä<82>­<82>¾<82>³<82>¢<81>F");

                double weight = stdIn.nextDouble();

                double bmi = weight / Math.pow(height, 2);

                System.out.println("BMI<92>l<82>Í" + (Math.floor(bmi*100))/100);

              }
            }


