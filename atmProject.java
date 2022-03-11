import java.util.Scanner;

/**
 * atmProject
 */
public class atmProject {
  public static void main(String[] args) {
  String userName, password;
  Scanner userin = new Scanner(System.in);
  int chance = 3;
  
  
  while (chance > 0) {
      System.out.print("Kullanıcı Adınızı Giriniz :");
      userName = userin.nextLine();
      System.out.print("Parolanızı Giriniz : ");
      password = userin.nextLine();

      if (userName.equals("Ozkan") && password.equals("dev123")) {
          System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
          int select;
          int balance = 1500;
          
          do {
              System.out.println("1-Para yatırma\n" +
                      "2-Para Çekme\n" +
                      "3-Bakiye Sorgula\n" +
                      "4-Çıkış Yap");
              System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = userin.nextInt();

              switch (select){

                  case 1:
                  System.out.print("Para miktarı : ");
                  int price = userin.nextInt();
                  balance += price;
                  break;

                  case 2:
                  System.out.print("Para miktarı : ");
                    price = userin.nextInt();
                  if (price > balance) {
                      System.out.println("Bakiye yetersiz.");
                  } else {
                      balance -= price;
                  }
                  break;

                  case 3:
                  System.out.println("Bakiyeniz : " + balance);
                  break;
              }
              

          } 
          
          while (select != 4);
          System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
          break;
      } else {
          chance--;
          System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
          if (chance== 0) {
              System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
          } else {
              System.out.println("Kalan Hakkınız : " + chance);
          }
      }
  }
  userin.close();
  }
}