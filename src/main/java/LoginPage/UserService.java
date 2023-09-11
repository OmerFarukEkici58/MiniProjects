package LoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> emails=new ArrayList<>();
    List<String> passwords=new ArrayList<>();
    //List<User> users=new ArrayList<>();-->practice


    //2-ad-soyad,email,şifre alıp->listeye kaydedelim
    public void register() {
        Scanner inp=new Scanner(System.in);
        System.out.println("Ad-Soyad giriniz: ");
        String name=inp.nextLine();

        //email geçersizse tekrar girilmeli
        String email;
        boolean isValid;
        boolean isExistEmail;
        do {
            System.out.println("Email giriniz :");
            email=inp.nextLine();
            isValid=validateEmail(email);
            isExistEmail=this.emails.contains(email);
            if (isExistEmail){
                System.out.println("Bu email ile kayıtlı kullanıcı zaten var");
                isValid=false;
            }
        }while (!isValid);

        //passsword oluşturma...


    }

    //ÖDEVV:validateEmail ve validatePassword
    private boolean validateEmail(String email){
        return true;

    }

    private boolean validatePassword(String email){
        return true;

    }





}
