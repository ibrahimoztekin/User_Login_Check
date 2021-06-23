import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        String userName,password,tercih,newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if(!userName.equals("patika")){
            System.out.print("Kulanncı Adı yanlış.\n1:Şifremi Değiştimek İstiyorum\n2:Şifremi Değiştirmek İstemiyorum\nSeçiminiz: ");
            tercih=input.nextLine();
            if(tercih.equals("1")){
                System.out.print("Yeni Şifreniz: ");
                newPassword=input.nextLine();
                if(password.equals(newPassword) || newPassword.equals("java123")){
                    System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz");
                }
                else {
                    System.out.println("Şifre Oluşturuldu");
                }
            }
            else {
                System.out.println("Tekrar Deneyiniz");
            }
        }
        else if (password.equals("java123")){

            System.out.println("Sisteme Giriş Sağlandı.");
        }
        else {
            System.out.println("Hatalı Giriş");
        }

    }
}
