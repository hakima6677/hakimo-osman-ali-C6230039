import java.util.Date;
import java.util.Scanner;
public class EVCplus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date currentDateAndTime = new Date();
        int phonenumber = 619467135;//qofka userka ah inuu asi lacag isku warejin karin//
        int opp;
        double Haraagaga = 1000;
        double Haraagaga_account = 500;
        System.out.print("fadlan Soo Geli *770# :");
        String Evcplus = input.nextLine();
        // waxa lagu hubina in aad so galisay *770#
        if (Evcplus.equals("*770#")) {
            System.out.print("EVCplus\n Fadlan Gili PIN-kaaga: ");
            int Pin = input.nextInt();
            // waxa lagu hubina in aad so galisay pin saxan
            if (Pin == 7135) {
                System.out.println("EVCPLUS");
                System.out.println("  1. Itus Haraagaga");
                System.out.println("  2. Kaarka Hadalka");
                System.out.println("  3. Bixi Biil");
                System.out.println("  4. Uwareeji EVCPlus");
                System.out.println("  5. Warbixin Kooban");
                System.out.println("  6. Salaam Bank");
                System.out.println("  7. Mareynta");
                System.out.println("  8. Biilka Payment");
                System.out.println("  9. TAAJ");
                int option = input.nextInt();
                //1. hada doratid waxa lagu tusidona haragaga
                if (option == 1) {
                    System.out.println("Haraagagu waa $" + Haraagaga);
                    //2. hada doratid kaarka hadalka
                } else if (option == 2) {
                    System.out.println("Kaarka Hadalka");
                    System.out.println("1. Ku shuba Airtime");
                    System.out.println("2. Ugu dhub airtime");
                    System.out.println("3. MIFI Packages");
                    System.out.println("4. Ku shuba internet");
                    System.out.println("5. Ugu shub qof kale (MMT)");

                    //  ina ku shubatid  Airtime
                    int Kushubo_airtime = input.nextInt();
                    if (Kushubo_airtime == 1) {
                        System.out.print("Fadlan Gili Lacagta: ");
                        int Amount_Kaar = input.nextInt();
                        if (Amount_Kaar > Haraagaga) {
                            System.out.println("Haraaga xisaabtaada kuguma filna");
                        } else {
                            System.out.println("Ma hubtaa inaad $" + Amount_Kaar + " ugu shubtid?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            opp = input.nextInt();
                            if (opp == 1) {
                                Haraagaga -= Amount_Kaar;
                                System.out.println("Waad ku guuleysatay inaad ku shubto $" + Amount_Kaar + " Tar:" + currentDateAndTime + ". Haraagagaaga  waa $" + Haraagaga);
                            } else {
                                System.out.println("Mahadsanid.");
                            }
                        }
                    } else if (Kushubo_airtime == 2) {
                        System.out.println("Fadlan Geli Mobilka.");
                        int NumberKa_shubida = input.nextInt();
                        System.out.print("Fadlan Geli Lacagta: ");
                        int Amount = input.nextInt();
                        if (Amount > Haraagaga) {
                            System.out.println("Haraaga xisaabtaada kuguma filna");
                        } else {
                            System.out.println("Ma hubtaa inaad $" + Amount + " ugu shubtid " + NumberKa_shubida + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            //hubinta  ku shubida
                            opp = input.nextInt();
                            //opp variable lagu keydinayo jawabta uu userka dortay 1.haa 2.maya
                            if (opp == 1) {
                                Haraagaga -= Amount;
                                System.out.println("Waad ku guuleysatay inaad $" + Amount + " ugu shubto " + NumberKa_shubida + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                            } else {
                                System.out.println("Mahadsanid.");
                            }
                        }
                        // qeybta 3aad ee airtime mifi in aad ku shubatid
                    } else if (Kushubo_airtime == 3) {
                        System.out.println("Evcplus \n 1: Ku shubo data-da MIFI ");
                        int Mifi = input.nextInt();
                        if (Mifi == 1) {
                            int date_Limited;
                            do {
                                System.out.println("-Internet Bundle Recharge -");
                                System.out.println("1. Isbuucle (weekly)");
                                System.out.println("2. Maalinle (Daily)");
                                System.out.println("3. Bille (Mifi)");
                                System.out.println("4. Bixid");
                                date_Limited = input.nextInt();

                                if (date_Limited == 1) {
                                    System.out.println("Fadlan Dooro bunle Ka");
                                    System.out.println("1.$5 = 10 GB");
                                    System.out.println("2.$10 = 25 GB");
                                    int date_Exchange = input.nextInt();
                                    if (date_Exchange == 1) {
                                        System.out.print("Fadlan Geli MIFI user. ");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $5 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int xaqiijinta_datada = input.nextInt();
                                        if (xaqiijinta_datada == 1) {
                                            Haraagaga -= 5;
                                            System.out.println("Waad ku guuleysatay inaad 10GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("Mahadsanid.");
                                        }
                                    } else if (date_Exchange == 2) {
                                        System.out.print("Fadlan Geli MIFI user: ");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $10 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int hubin = input.nextInt();
                                        if (hubin == 1) {
                                            Haraagaga -= 10;
                                            System.out.println("Waad ku guuleysatay inaad 25GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("Mahadsanid.");
                                        }
                                    } else {
                                        System.out.println("Xulashadaadu khalad ayay ahayd.");
                                    }

                                } else if (date_Limited == 2) {
                                    System.out.println("Fadlan Dooro bunle Ka");
                                    System.out.println("1. $1 = 2GB");
                                    System.out.println("2. $2 = 5GB");
                                    int daily_option = input.nextInt();
                                    if (daily_option == 1) {
                                        System.out.print("Fadlan Geli MIFI user.");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $1 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 1;
                                            System.out.println("Waad ku guuleysatay inaad 2GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid");
                                        }
                                    } else if (daily_option == 2) {
                                        System.out.print("Fadlan Geli MIFI user.");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $2 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 2;
                                            System.out.println("Waad ku guuleysatay inaad 5GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    }

                                } else if (date_Limited == 3) {
                                    System.out.println("Fadlan Dooro bunle Ka");
                                    System.out.println("1.$20 = 40 GB");
                                    System.out.println("2.$40 = 80 GB");
                                    System.out.println("3.$60 = 150 GB");
                                    System.out.println("4.$30 = Unlimited Month");
                                    int monthyl_package = input.nextInt();
                                    if (monthyl_package == 1) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 20;
                                            System.out.println("Waad ku guuleysatay inaad 40GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 2) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $40 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 40;
                                            System.out.println("Waad ku guuleysatay inaad 80GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 3) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $60 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 60;
                                            System.out.println("Waad ku guuleysatay inaad 150GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    } else if (monthyl_package == 4) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $30 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 30;
                                            System.out.println("Waad ku guuleysatay inaad Unlimited Monthly ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    }
                                } else if (date_Limited == 4) {
                                    System.out.println("Waad ka baxday menu-ga MIFI.");
                                } else {
                                    System.out.println("Fadlan dooro ikhtiyaar sax ah.");
                                }

                            } while (date_Limited != 4);
                        }
                        //ku shubashada airtime qeybta 4aad
                    } else if (Kushubo_airtime == 4) {
                        System.out.println("Evcplus \n 1: Ku shubo data-da MIFI ");
                        int internet = input.nextInt();
                        if (internet >= 1 && internet <= 5) {
                            System.out.println("-- Fadlan Dooro numberka- ku shubeyso -- ");
                            System.out.println("1. isbuucle (Weekly)");
                            System.out.println("2. TIME BASED PACKAGES");
                            System.out.println("3. DATA");
                            System.out.println("4. Maalinle(Daily)");
                            System.out.println("5 .Bille (MIFI)");
                            int kushubashada = input.nextInt();
                            if (kushubashada == 1) {
                                System.out.print("Fadlan Geli Lacagta :");
                                int Lacagta_ku_shubashada = input.nextInt();
                                System.out.println("Ma hubtaa in aad $" + Lacagta_ku_shubashada);
                                System.out.println("1. Haa \n 2.Maya");
                                int Hubinta_ku_shubida = input.nextInt();
                                if (Hubinta_ku_shubida == 1 && Lacagta_ku_shubashada <= Haraagaga) {
                                    System.out.println("Waxa ku shubatay $" + Lacagta_ku_shubashada);
                                } else if (Hubinta_ku_shubida == 1 && Lacagta_ku_shubashada > Haraagaga) {
                                    System.out.println("Haraagaga kuma Filna No-Mobilka");
                                } else {
                                    System.out.println("mahadsanid.");
                                }
                                //Time_Based QeybTisa//
                            } else if (kushubashada == 2) {
                                System.out.println("Fadlan Geli LacagTa: ");
                                int Lacagta_ugu_shubida = input.nextInt();
                                System.out.println("Ma Hubtaa in aad $" + Lacagta_ugu_shubida + " ku shubatid time based data " + "?");
                                System.out.println("1.Haa \n 2.Maya");
                                int Hubinta_ugu_shubida = input.nextInt();
                                if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida <= Haraagaga) {
                                    System.out.println("Waxa ku  shubatay  internet unlimitlly" + " " + currentDateAndTime + " Haraagaagu waa $" + (Haraagaga - Lacagta_ugu_shubida));
                                } else if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida > Haraagaga) {
                                    System.out.println("Haraagaga kuma Filna No-Mobilka");
                                } else {
                                    System.out.println("mahadsanid.");
                                }
                                //data//
                            } else if (kushubashada == 3) {
                                System.out.println("Fadlan Geli LacagTa. ");
                                int Lacagta_ugu_shubida = input.nextInt();
                                System.out.println("Ma Hubtaa in aad $" + Lacagta_ugu_shubida + " ku shubatid");
                                System.out.println("1.Haa \n 2.Maya");
                                int Hubinta_ugu_shubida = input.nextInt();
                                if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida <= Haraagaga) {
                                    System.out.println("Waxa ku shubatay $" + Lacagta_ugu_shubida + " " + currentDateAndTime + " Haraagaagu waa $" + (Haraagaga - Lacagta_ugu_shubida));
                                } else if (Hubinta_ugu_shubida == 1 && Lacagta_ugu_shubida > Haraagaga) {
                                    System.out.println("Haraagaga kuma Filna No-Mobilka");
                                } else {
                                    System.out.println("mahadsanid.");
                                }
                            } else if (kushubashada == 4) {
                                System.out.println("Fadlan Dooro bunle Ka");
                                System.out.println("1. $1 = 2GB");
                                System.out.println("2. $2 = 5GB");
                                int daily_option = input.nextInt();
                                if (daily_option == 1 && Haraagaga >= 1) {
                                    System.out.print("Fadlan Geli mobileka:");
                                    int mobile_number = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $1 ku shubatid " + mobile_number);
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int ans = input.nextInt();
                                    if (ans == 1) {
                                        Haraagaga -= 1;
                                        System.out.println("Waad ku guuleysatay inaad 2GB ku shubato " + mobile_number + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                    } else {
                                        System.out.println("mahadsanid");
                                    }
                                } else if (daily_option == 2 && Haraagaga >= 2) {
                                    System.out.print("Fadlan Geli mobile numerka:");
                                    int mobile_number = input.nextInt();
                                    System.out.println("Ma hubtaa inaad $2 ku  shubatid " + mobile_number);
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int ans = input.nextInt();
                                    if (ans == 1) {
                                        Haraagaga -= 2;
                                        System.out.println("Waad ku guuleysatay inaad 5GB ku shubto " + mobile_number + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                    }
                                    // qeybta 5aad ee airtime mifi in aad ku shubatid
                                } else if (kushubashada == 5) {
                                    System.out.println("Fadlan Dooro bunle Ka");
                                    System.out.println("1.$20 = 40 GB");
                                    System.out.println("2.$40 = 80 GB");
                                    System.out.println("3.$60 = 150 GB");
                                    System.out.println("4.$30 = Unlimited Month");
                                    int monthyl_package = input.nextInt();
                                    if (monthyl_package == 1 && Haraagaga >= 20) {
                                        System.out.print("Fadlan Geli MIFI user .");
                                        int MIFI_user = input.nextInt();
                                        System.out.println("Ma hubtaa inaad $20 ugu shubtid " + MIFI_user);
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int ans = input.nextInt();
                                        if (ans == 1) {
                                            Haraagaga -= 20;
                                            System.out.println("Waad ku guuleysatay inaad 40GB ugu shubto " + MIFI_user + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);
                                        } else {
                                            System.out.println("mahadsanid.");
                                        }
                                    }
                                }
                            }
                        }
                        // qeybta 5aad ee airtime  in aad ku shubatid internet
                    } else if (Kushubo_airtime == 5) {
                        System.out.print("Fadlan Geli mobile numerka:");
                        int number = input.nextInt();
                        System.out.println("Fadlan Geli LacagTa: ");
                        int Lacagta_ugu_shubida = input.nextInt();
                        System.out.println("Ma hubtaa inaad  ugu shubtid $" + Lacagta_ugu_shubida + " " + number + "?");
                        System.out.println("1. Haa");
                        System.out.println("2. Maya");
                        int ans = input.nextInt();
                        if (ans == 1 && Lacagta_ugu_shubida <= Haraagaga) {
                            Haraagaga -= 1;
                            System.out.println("Waad ku guuleysatay inaad 2GB ugu shubto " + number + " Tar:" + currentDateAndTime + ". Haraagaga  waa $" + Haraagaga);

                        } else if (ans == 1 && Lacagta_ugu_shubida > Haraagaga) {
                            System.out.println("Haraagaga kuma Filna No-Mobilka");

                        } else {
                            System.out.println("mahadsanid.");
                        }
                    }
                    // qeybta 3aad ee evcplus
                } else if (option == 3) {
                    System.out.println("Bixi Biil");
                    System.out.println("1. Post Paid");
                    System.out.println("2. Ku iibso");
                    int Bixi_Biilka = input.nextInt();
                    if (Bixi_Biilka == 1) {
                        System.out.println("Post Paid");
                        System.out.println(" 1.Ogow Biilka.");
                        System.out.println(" 2.Bixi Biil.");
                        System.out.println(" 3.ka Bixi Biil.");
                        int Post_Paid = input.nextInt();
                        if (Post_Paid == 1) {
                            System.out.println("error ocurred, please try again later");
                        } else if (Post_Paid == 2) {
                            System.out.print("Fadlin Geli Lacagta .");
                            int lacagta_biilka = input.nextInt();
                            System.out.println("ma hubta in aad bixiso lacagta biilka $" + lacagta_biilka);
                            System.out.println("1.Haa");
                            System.out.println("2.Maya");
                            int ans = input.nextInt();
                            if (ans == 1) {
                                System.out.println("Waxa aad Bixisay Biilka Lacagta $" + lacagta_biilka + " haraagaagu waaa $" + (Haraagaga - lacagta_biilka));
                            } else if (lacagta_biilka > Haraagaga) {
                                System.out.println("haraagaaga xisabta kuguma filna.");
                            } else {
                                System.out.println("mahadsanid.");
                            }
                        } else if (Post_Paid == 3) {
                            System.out.println("fadlan gali mobileka.");
                            int mobile_number = input.nextInt();
                            System.out.println("fadlan gali lacagta.");
                            int lacagta = input.nextInt();
                            System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay : $" + lacagta + " oo laga rabo " +
                                    "tel No " + mobile_number);
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int ans = input.nextInt();
                            if (ans == 1) {
                                System.out.println("Waxa aad bixisay biilka $" + lacagta + " Mobilka No: 252" + mobile_number + " Tar: " + currentDateAndTime);
                                System.out.println("Haraaga xisaabtaadu waa $" + (Haraagaga - lacagta));
                            } else if (lacagta > Haraagaga) {
                                System.out.println("Haraaga Xisaabtaadu kuguma filna, mobile No: 252 " + mobile_number);

                            } else {
                                System.out.println("mahadsanid.");
                            }
                        }
                    } else if (Bixi_Biilka == 2) {
                        System.out.print("Fadlan Geli aqoonsiga ganacsiga");
                        int ganacsiga_aqoonsiga = input.nextInt();
                        System.out.println("ma hubtaa in aad ganacsiga aqoonsiga galisay: " + ganacsiga_aqoonsiga);
                        System.out.println("1. haa");
                        System.out.println("2. maya");
                        int ans = input.nextInt();
                        if (ans == 1) {
                            System.out.println("wali adegan si hufan looma tixgalin.mahadsanid");
                        } else {
                            System.out.println("mahadsanid.");
                        }
                    }
                    // qeybta 4aad ee evcplus
                } else if (option == 4) {
                    System.out.println("Fadlan geli mobile-ka:");
                    int number = input.nextInt();
                    if (String.valueOf(number).length() != 9) {// qeybtan wxey ku shege in 9numer ka yar la ogolen
                        System.out.println("Number-ka aad gelisay sax ma aha! Waa in uu ahaadaa 9 digit.");
                    } else if (number == phonenumber) {// userka inuu asi wxba isku dirikarin
                        System.out.println("Diraha iyo loo diraha isku mid ma noqon karaan");
                    } else {
                        System.out.println("Fadlan geli lacagta:");
                        int money = input.nextInt();
                        if (money > Haraagaga) {
                            System.out.println("Haraagaaga kuma filna lacagtaas.");
                        } else {
                            System.out.println("[-EVC PLUS-] Ma hubtaa inaad $" + money + " u wareejisid " + number + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int ans = input.nextInt();
                            if (ans == 1) {
                                System.out.println("[-EVC PLUS-] $" + money + " ayaad u wareejisay " + number + " Tar:" + currentDateAndTime + " Haraagaagu waa $" + (Haraagaga - money));

                            } else {
                                System.out.println("mahadsanid.");
                            }
                        }
                    }
                    // qeybta 5aad ee evcplus
                } else if (option == 5) {
                    System.out.print("Warbixin Kooban\n");
                    System.out.println(" 1. Last Action");
                    System.out.println(" 2. Wareejintii u dambsay");
                    System.out.println(" 3. iibsashadii u dambeysay");
                    System.out.println(" 4. Last 3 Actions");
                    System.out.println(" 5. Email Me My Activity");
                    int WarbixinTa = input.nextInt();
                    String Last_1 = "[-Evcplus-] \nwaxaad $34 ka heshay 0617931404," + "Tar:" + currentDateAndTime + "Haraagaagu waa $34.";
                    String Last_2 = "[-Evcplus-] \nwaxaad $3 ka heshay 066926320," + "Tar:" + currentDateAndTime + "Haraagaagu waa $37. ";
                    String Last_3 = "[-Evcplus-] \nwaxaad $3aad u wareejisay 0610885598," + "Tar:" + currentDateAndTime + "Haraagaagu waa $34";
                    String ugu_danbeysay = "[-Evcplus-] \nwaxaad $10 aad u wareejisay 0610885507, Tar: 12/03/24 04:20:18 \nHaraagaagu waa $24.";
                    if (WarbixinTa == 1) {
                        System.out.println(Last_1);
                    } else if (WarbixinTa == 2) {
                        System.out.println(Last_2);
                    } else if (WarbixinTa == 3) {
                        System.out.println(ugu_danbeysay);
                    } else if (WarbixinTa == 4) {
                        System.out.println(Last_1 + "\n" + Last_2 + "\n" + Last_3);
                    }
                    // qeybta 6aad ee evcplus
                } else if (option == 6) {
                    //qeybtan waxa ku isticmalay do while loop
                    do {
                        System.out.println("---- Salaam Bank --------");
                        System.out.println("1. Itus Haraagaaga");
                        System.out.println("2. Lacag dhigasho");
                        System.out.println("3. Lacag qaadasho");
                        System.out.println("4. Ka Wareeji EVCPLUS");
                        System.out.println("5. Ka Wareeji Account-kaga");
                        System.out.println("6. Hubi wareejin account");
                        System.out.println("7. Maareynta bankiga");
                        System.out.print("Dooro ikhtiyaar: ");
                        opp = input.nextInt();
                        switch (opp) {
                            case 1:
                                System.out.print("Fadlan geli pinkaaga accounkaaga: ");
                                // in la hubiyo passwordka
                                int pass = input.nextInt();
                                if (pass == 5566) {
                                    System.out.println("Haraaga account-bangiga waa  $" + Haraagaga_account);
                                } else {
                                    System.out.println("Pinka waa qalad");
                                }
                                break;
                            case 2:
                                System.out.print("Fadlan geli lacagta: ");
                                int money = input.nextInt();
                                System.out.print("Fadlan geli numberkaaga sirta ee bangiga: ");
                                pass = input.nextInt();
                                if (pass == 5566) {
                                    System.out.println("Ma hubtaa inaad $" + money + " dhigatid account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        Haraagaga_account += money;
                                        System.out.println("Waxaad account-kaaga dhigatay $" + money + ". Haraagaaga waa $" + Haraagaga_account);
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                } else {
                                    System.out.println("Numberka sirta waa qalad");
                                }
                                break;
                            case 3:
                                System.out.print("Fadlan geli lacagta: ");
                                money = input.nextInt();
                                System.out.print("Fadlan geli numberkaaga sirta ee bangiga: ");
                                pass = input.nextInt();
                                if (pass == 5566) {
                                    System.out.println("Ma hubtaa inaad $" + money + " ka qaadatid account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        if (money <= Haraagaga_account) {
                                            Haraagaga_account -= money;
                                            System.out.println("Waxaad account-kaaga ka qaaday $" + money + ", Haraagaaga waa $" + Haraagaga_account);
                                        } else {
                                            System.out.println("Haraagaaga kuguma filna!");
                                        }
                                    } else {
                                        System.out.println("Mahadsanid");
                                    }
                                } else {
                                    System.out.println("Numberka sirta waa qalad");
                                }
                                break;
                            case 4:
                                System.out.println("Fadlan dooro xisaabta Bangiga:");
                                System.out.println("1. Darasalaam Bank");
                                System.out.println("2. Bank Beeraha");
                                System.out.println("3. SALAAM SOMALI BANK");
                                System.out.println("4. Salaam Sch");
                                int Bank_Money = 1000;
                                // Qeybta 1 aad
                                int Salaam_Bank = input.nextInt();
                                if (Salaam_Bank == 1) {
                                    System.out.print("Fadlan soo Geli Account-ka : ");
                                    int Account_user = input.nextInt();
                                    System.out.print("Fadlan Geli Lacagta :");
                                    int Amount_salam = input.nextInt();
                                    System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Amount_salam);
                                    System.out.println("1: Haa");
                                    System.out.println("2: Maye");

                                    int Check = input.nextInt();
                                    if (Check == 1) {
                                        if (Bank_Money >= Amount_salam) {
                                            System.out.println("Haraaga Xisaabtada Kuguma Filna" + Account_user);
                                        } else {
                                            double Result_salaam = Bank_Money - Amount_salam;
                                            System.out.println("waxa u wareejisay Accoun-ta $ " + Amount_salam + "Haraaga Xisaabtada waa " + Result_salaam);
                                        }
                                    } else if (Check == 2) {
                                        System.out.println("Mahadsanid !");
                                    }
                                    // Qeybta 2 aad
                                } else if (Salaam_Bank == 2) {
                                    System.out.print("Fadlan soo Geli Account-ka : ");
                                    int Account_user = input.nextInt();
                                    System.out.print("Fadlan Geli Lacagta :");
                                    int Amount_salam = input.nextInt();
                                    System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Amount_salam);
                                    System.out.println("1: Haa");
                                    System.out.println("2: Maye");

                                    int Check = input.nextInt();
                                    if (Check == 1) {
                                        if (Bank_Money <= Amount_salam) {
                                            System.out.println("Haraaga Xisaabtada Kuguma Filna: " + Account_user);
                                        } else {
                                            double Result_salaam = Bank_Money - Amount_salam;
                                            System.out.println("waxa u wareejisay Accoun-ta $ " + Amount_salam + "Haraaga Xisaabtada waa " + Result_salaam);
                                        }
                                    } else if (Check == 2) {
                                        System.out.println("Mahadsanid !");
                                    }
                                    // Qeybta 3 aad
                                } else if (Salaam_Bank == 3) {
                                    System.out.print("Fadlan soo Geli Account-ka : ");
                                    int Account_user = input.nextInt();
                                    System.out.print("Fadlan Geli Lacagta :");
                                    int Amount_salam = input.nextInt();
                                    System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Amount_salam);
                                    System.out.println("1: Haa");
                                    System.out.println("2: Maye");

                                    int Check = input.nextInt();
                                    if (Check == 1) {
                                        if (Bank_Money <= Amount_salam) {
                                            System.out.println("Haraaga Xisaabtada Kuguma Filna: " + Account_user);
                                        } else {
                                            double Result_salaam = Bank_Money - Amount_salam;
                                            System.out.println("waxa u wareejisay Accoun-ta $ " + Amount_salam);
                                            System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                        }
                                    } else if (Check == 2) {
                                        System.out.println("Mahadsanid !");
                                    }
                                }

//                                    // Qeybta 4 aad

                                else if (Salaam_Bank == 4) {
                                    System.out.print("Fadlan soo Geli Account-ka : ");
                                    int Account_user = input.nextInt();
                                    System.out.print("Fadlan Geli Macluumaadka : ");
                                    String Macluumaadka = input.next();
                                    System.out.print("Fadlan Geli Lacagta :");
                                    int Amount_salam = input.nextInt();
                                    System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Amount_salam);
                                    System.out.println("1: Haa");
                                    System.out.println("2: Maye");

                                    int Check = input.nextInt();
                                    if (Check == 1) {
                                        if (Bank_Money <= Amount_salam) {
                                            System.out.println("Haraaga Xisaabtada Kuguma Filna: " + Account_user);
                                        } else {
                                            double Result_salaam = Bank_Money - Amount_salam;
                                            System.out.println("waxa u wareejisay Accoun-ta $ " + Amount_salam);
                                            System.out.println("Haraaga Xisaabtada waa " + Result_salaam);
                                        }
                                    } else if (Check == 2) {
                                        System.out.println("Mahadsanid !");
                                    }
                                } else if (Salaam_Bank == 5) {
                                    System.out.print("Fadlan soo Geli Account-ka : ");
                                    int Account_user = input.nextInt();
                                    System.out.print("Fadlan Geli Lacagta :");
                                    int Amount_salam = input.nextInt();
                                    System.out.println("Ma hubtaa in aad udirayso Account-ka " + Account_user + " $ " + Amount_salam);
                                    System.out.println("1: Haa");
                                    System.out.println("2: Maye");

                                    int Check = input.nextInt();
                                    if (Check == 1) {
                                        if (Bank_Money <= Amount_salam) {
                                            System.out.println("Haraaga Xisaabtada Kuguma Filna: " + Account_user);
                                        } else {
                                            double Result_salaam = Bank_Money - Amount_salam;
                                            System.out.println("waxa u wareejisay Accoun-ta $ " + Amount_salam + "Haraaga Xisaabtada waa " + Result_salaam);
                                        }
                                    } else if (Check == 2) {
                                        System.out.println("Mahadsanid !");

                                    }
                                }
                                break;
                            // Qeybta 5 aad ee accounka
                            case 5:
                                System.out.print("Fadlan soo geli account ama mobile: ");
                                int account_number = input.nextInt();
                                if (account_number  < 931404) {
                                    System.out.println("Invalid Account Number");
                                } else if (account_number  == 931404) {
                                    System.out.print("Fadlan geli lacagta: ");
                                    int lacagta_accounka = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Fadlan geli sirta bangigaaga: ");
                                    int password = input.nextInt();
                                    if (password != 6655) {
                                        System.out.println(" numberka Sirta bangiga waa qalad");
                                    } else {
                                        System.out.println("Ma hubtaa inaad $" + lacagta_accounka  + " u wareejiso Bank Account: jubba-hybermarket (jubba)"+ account_number +  "? ");
                                        System.out.println("\n1. Haa\n2. Maya");
                                        int Check = input.nextInt();
                                        if (Check == 1) {
                                            if (lacagta_accounka  > Haraagaga_account) {
                                                System.out.println("Haraagaga xisaabta kuguma filna: " + account_number );
                                            } else {
                                                Haraagaga_account -= lacagta_accounka ;
                                                System.out.println("Waxaad u wareejisay account-ka $" + account_number  + ". Haraaga xisaabta waa $" + Haraagaga_account);
                                            }
                                        } else
                                            System.out.println("Mahadsanid");
                                        break;
                                    }
                                }
                                break;
                            // Qeybta 6 aad otp
                            case 6:
                                System.out.print("Geli OTP: ");
                                String otp = input.nextLine();
                                System.out.println("Your otp for log in :" + otp);
                                break;
                            // Qeybta 7 aad  mareynta bankiga
                            case 7:
                                System.out.println("1. Bedel PIN-ka Bankiga");
                                System.out.println("2. Bedel Password-ka Bankiga");
                                int maareynBank = input.nextInt();
                                input.nextLine();

                                if (maareynBank == 1) {
                                    System.out.print(" fadlan so Geli PIN_kaga  hore: ");
                                    int Pin1 = input.nextInt();
                                    int user_password = 1122;
                                    if (Pin1 == user_password) {
                                        System.out.print(" fadlan so Geli PIN_kaga cusub: ");
                                        user_password = input.nextInt();
                                        System.out.println("PIN_kaga  cusub waa: " + user_password);
                                    } else {
                                        System.out.println("PIN_kaga  hore waa khalad.");
                                    }
                                } else if (maareynBank == 2) {
                                    System.out.print(" fadlan so gali Password_kaga  hore: ");
                                    String password1 = input.nextLine();
                                    System.out.print(" fadlan so gali Password_kaga  cusub: ");
                                    String passNew = input.nextLine();
                                    System.out.println("Password cusub waa: " + passNew);
                                }
                                break;
                            // Qeybta 8 aad
                            case 8:
                                System.out.println("Ka bax menu weli lama dhameystirin");
                                break;
                            case 9:
                                System.out.println("Waa lagu laabtay menu-ga weyn.");
                                break;
                            default:
                                System.out.println("Fadlan dooro number sax ah");
                        }
                    } while (opp != 9);// Menu-ga wuu soo noqnoqonayaa ilaa user-ka uu 9 ka doorto
                    //option 7 ecvplus waye qeybtan mareynta//
                } else if (option == 7) {
                    System.out.println("Maareynta:");
                    System.out.println("1. Bedel lambarkaga sirta ah");
                    System.out.println("2. Bedel Luuqad");
                    System.out.println("3. Wargelin Mobile Lumay");
                    System.out.println("4. Lacag Xirasho");
                    System.out.println("5. U celi lacag qaldantay");
                    System.out.println("6.Fadlan numberka is diiwan Gelinta");
                    int maareynta = input.nextInt();
                    switch (maareynta) {
                        case 1:
                            if (maareynta == 1) {
                                System.out.println("Fadlan geli pin-kaaga cusub");
                                int pin = input.nextInt();
                                System.out.println("Hubi pin-kaaga cusub");
                                int hubinta_pinka = input.nextInt();
                                if (pin == hubinta_pinka) {
                                    System.out.println("Waad ku guuleysatay, pin-ka waa la bedelay.");
                                } else {
                                    System.out.println("isku day in aad pin iskumida so galiso" + pin + "hubi markale" + hubinta_pinka);
                                    break;
                                }
                            }
                        case 2:
                            System.out.println("Fadlan dooro luqada aad rabto");
                            System.out.println("1. hadii aad rabto English");
                            System.out.println("2. hadii aad rabto Somali");
                            opp = input.nextInt();
                            if (opp == 1)
                                System.out.println("[-EVCPLUS-] you have successfully changed your language");
                            if (opp == 2)
                                System.out.println("[-EVCPLUS-] waad ku guulaysatay in aad badasho luqadda");
                            break;
                        case 3:
                            System.out.println("Fadlan geli mobileka lumay");
                            int phone = input.nextInt();
                            System.out.println("fadlan geli  numberka passwordka");
                            int password = input.nextInt();
                            System.out.println("Ma hubtaa in aad u diiwaan geliso lumid number-kan" + phone + "?\n" + "1.Haa\n" + "2.Maya");
                            opp = input.nextInt();
                            if (opp == 1)
                                System.out.println("Waxaad ku guuleysatay inaad diwaan geliso  " + phone + "  " + currentDateAndTime);
                            else
                                System.out.println("Mahadsanid");
                            break;
                        case 4:
                            System.out.println("Fadlan geli numberka lagu Qalday");
                            int numerka_laguqalday = input.nextInt();
                            System.out.println("Fadlan geli numberka loo rabay");
                            numerka_laguqalday = input.nextInt();
                            System.out.println("Ma hubtaa in aad xirto lacagtan?");
                            System.out.println("1.haa");
                            System.out.println("2.maya");
                            opp = input.nextInt();
                            if (opp == 1)
                                System.out.println("Waad ku guuleysty inaad xirto lacagtan");
                            else
                                System.out.println("Mahsanid");
                            break;
                        case 5:
                            System.out.println("Fadlan geli aqoonsiga lacag diridda");
                            int aqoonsiga = input.nextInt();
                            while (aqoonsiga != aqoonsiga) {
                                System.out.println("invalid input format(length)\n fad geli aqoosiga");
                                aqoonsiga = input.nextInt();
                            }
                            System.out.println("Ma hubtaa in aad celiso lacagtaan ?");
                            System.out.println("1.haa");
                            System.out.println("2.maya");
                            int ans = input.nextInt();
                            if (ans == 1)
                                System.out.println("Waad ku guuleysatay inaad celiso lacagtan");
                            else
                                System.out.println("Mahsanid");
                            break;
                        case 6:
                            System.out.println("Fadlan geli numberka is diwaan galinta ");
                            phone = input.nextInt();
                            System.out.println("waxad ku guuleysatay inad is diwan gelido" + phone);
                            break;
                    }
                } else if (option == 8) {
                    // Qeybta 8 aad ee ecvpluska option 8 waye qeybtan
                    String[] evcPlusMenu = {
                            "1. Tus Haraaga Bill-ka",
                            "2. Wada Bixi Bill-ka",
                            "3. Qeyb Ka Mid Ah Bixi",
                            "0. Ka Bax"
                    };
                    String correctPin = "1234";
                    double Billka = 200.0;
                    double lacagta_labixiyay = 0.0;
                    int choice;

                    do {
                        System.out.println("\n[EVC_Plus Menu]");
                        for (String item : evcPlusMenu) {
                            System.out.println(item);
                        }
                        System.out.print("Fadlan dooro (0-3): ");
                        choice = input.nextInt();
                        input.nextLine();
                        switch (choice) {
                            case 1:
                                double balance = Billka - lacagta_labixiyay;
                                System.out.println("Haraaga bill-kaagu waa: $" + balance);
                                break;

                            case 2:
                                System.out.print("Fadlan geli PIN-kaaga: ");
                                String pinFull = input.nextLine();
                                if (pinFull.equals(correctPin)) {
                                    lacagta_labixiyay = Billka;
                                    System.out.println("Bill-ka oo dhan ($" + Billka + ") waa la bixiyay. Haraagagu waa $0.0");
                                } else {
                                    System.out.println("PIN-ka waa khaldan.");
                                }
                                break;

                            case 3:
                                System.out.print("Fadlan geli lacagta aad rabto inaad bixiso: $");
                                double qeybka_bixi = input.nextDouble();
                                input.nextLine();
                                System.out.print("Fadlan geli PIN-kaaga: ");
                                String password = input.nextLine();
                                if (password.equals(correctPin)) {
                                    if (lacagta_labixiyay + qeybka_bixi > Billka) {
                                        System.out.println("Lacagta aad gelisay waa ka badan tahay haraaga.");
                                    } else {
                                        lacagta_labixiyay += qeybka_bixi;
                                        System.out.println("Waxaad bixisay $" + qeybka_bixi + " Haraaga cusub waa $" + (Billka - lacagta_labixiyay));
                                    }
                                } else {
                                    System.out.println("PIN-ka waa khalad.");
                                }
                                break;

                            case 0:
                                System.out.println("Waad ka baxday, mahadsanid!");
                                break;

                            default:
                                System.out.println("Doorasho khaldan, fadlan isku day mar kale.");
                        }

                    } while (choice != 0);//0 hada doorto wxa la joojin dona programka

                } else if (option == 9) {
                    taajMenu(input); // wuxu u wacaya / methodka taajka
                }


            } else {

                System.out.println("pinka aad so galisay waa qalad.");
            }
        }else {

            System.out.println("USSD code-ka aad gelisay waa qalad.");
        }
        // Qeybta 9 aad ee ecvpluska option 9 waye qeybtan wxa ku qabaneyna adeega taaj ama xawalad

    }public static void taajMenu(Scanner input) {
        int selection;
        String correctPin = "1234";
        System.out.println("\nTAAJ");
        System.out.println("1. Gudaha");
        System.out.println("2. Dibadda");
        System.out.println("3. Ogow Khidmada");
        System.out.println("4. Macluumaadka Xawaalada");
        System.out.println("5. Jooji Xawaalad");
        System.out.println("6. Furi Xawaalad");
        System.out.println("0. Ka bax");
        System.out.println("fadlan dooro (1-6)");
        selection = input.nextInt();
        input.nextLine();
        switch (selection) {
            case 1:
                System.out.print("Fadlan geli aqoonsiga lacag diridda (Password): ");
                String password = input.nextLine();
                if (password.equals(correctPin)) {
                    System.out.print("Magaca qofka gudaha aad u direyso: ");
                    String magaca = input.nextLine();
                    System.out.print(" fadlan so gali Lacagta aad direyso $: ");
                    double lacag = input.nextDouble();
                    input.nextLine();
                    System.out.println(" Waxaad u dirtay $" + lacag + " gudaha: " + magaca);
                } else {
                    System.out.println(" PIN khaldan.");
                }
                break;

            case 2:
                System.out.print("Fadlan geli aqoonsiga lacag diridda (password): ");
                String password1 = input.nextLine();
                if (password1.equals(correctPin)) {
                    System.out.print("Magaca qofka dibadda aad u direyso: ");
                    String magaca_qofka = input.nextLine();
                    System.out.print("Waddanka uu joogo: ");
                    String country = input.nextLine();
                    System.out.print(" fadlan so gali Lacagta aad direyso $: ");
                    double lacagta = input.nextDouble();
                    input.nextLine();
                    System.out.println(" Waxaad u dirtay $" + lacagta + " → " + magaca_qofka + " (" + country + ")");
                } else {
                    System.out.println("PIN khaldan.");
                }
                break;

            case 3:
                System.out.print("Geli lacagta aad rabto inaad dirto si loo xisaabiyo khidmada: ");
                double lacag = input.nextDouble();
                input.nextLine();
                double money = (lacag <= 50) ? 0.35 : 0.42;//waa qeybta qidmada dirista qimaheeda
                System.out.println("Khidmadaha lacagta $" + lacag + " waa: $" + money);
                break;

            case 4:
                System.out.print(" soo gali Magaca Diraha: ");
                String qofka_diraayo = input.nextLine();
                System.out.print(" soo gali Magaca Qaataha: ");
                String qofka_loodirayo = input.nextLine();
                System.out.print("Goobta: ");
                String goobta = input.nextLine();
                System.out.print("Lacagta $: ");
                double lacagta_ladirayo = input.nextDouble();
                input.nextLine();
                System.out.println("Xogta Xawaaladda: " + qofka_diraayo + " → " + qofka_loodirayo + " | Goob: " + goobta + " | $" + lacagta_ladirayo);
                break;

            case 5:
                System.out.print("Fadlan geli aqoonsiga lacag diridda (Password): ");
                String password2 = input.nextLine();
                if (password2.equals(correctPin)) {
                    System.out.print("Geli lambarka xawaaladda la joojinayo: ");
                    String lajoojinayo = input.nextLine();
                    System.out.println(" Xawaaladda " + lajoojinayo + " waa la joojiyey.");
                } else {
                    System.out.println("PIN khaldan.");
                }
                break;
            case 6:
                System.out.print("Fadlan geli aqoonsiga lacag diridda (Password): ");
                String password3 = input.nextLine();
                if (password3.equals(correctPin)) {
                    System.out.print("Geli lambarka xawaaladda la furayo: ");
                    String xawalad_lafuraayo = input.nextLine();
                    System.out.println(" Xawaaladda " + xawalad_lafuraayo + " waa la furay.");
                } else {
                    System.out.println("PIN khaldan.");
                }
                break;

            case 0://0 hda doorto programka wu jogsana
                System.out.println(" Mahadsanid, waad ka baxday.");
                break;

            default:
                System.out.println(" Doorasho khaldan, isku day mar kale.");
        }
    }
}