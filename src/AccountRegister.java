public class AccountRegister extends Main{
    boolean check = true;

    public void Register() throws InterruptedException {
        while(check)
        {
            String username, password, firstName, lastName, phone, email;
            System.out.println("Kullanıcı Adı: ");
            username = scanner.next();
            System.out.println("Şifre: ");
            password = scanner.next();

            if(new AccountCreate(username).registerCheck(accounts))
            {
                System.out.println("** Bu Kullanıcı Adı Daha Önce Alınmış! **\n");
                System.out.println("Kayıt İşlemine Devam Etmek İstiyor Musunuz? (Evet/Hayır)-> ");
                String devam = scanner.next();
                if (devam.toLowerCase().equals("evet"))
                {
                    System.out.println("***Lütfen Kullanıcı Adınızı Tekrar Oluşturunuz...***");
                    Thread.sleep(1000);

                }
                else if (devam.toLowerCase().equals("hayır"))
                {
                    System.out.println("Kayıt İşlemi İptal Ediliyor...");
                    Thread.sleep(1000);
                    System.out.println("Ana Menüye Dönülüyor...\n\n");
                    Thread.sleep(1000);
                    check = false;
                }
            }
            else
            {
                registerId++;
                accounts.add(new Account());
                accounts.get(registerId).SetUsername(username);
                accounts.get(registerId).SetPassword(password);
                accounts.get(registerId).SetId(registerId);
                check = false;
                System.out.println("**** Hesap Oluşturma İşlemi Başarılı...****\n\n");
                Thread.sleep(1000);
                System.out.println("Ana Menüye Dönebilmek İçin Bilgilerinizi Doldurunuz...\n");
                Thread.sleep(1000);
                System.out.println("İsminizi giriniz: ");
                lastName = scanner.next();
                System.out.println("Soyisminizi giriniz: ");
                firstName = scanner.next();
                System.out.println("Telefon Numaranızı giriniz: ");
                phone = scanner.next();
                System.out.println("E-Posta Adresinizi giriniz: ");
                email = scanner.next();

                users.get(registerId).setFirstName(firstName);
                users.get(registerId).setLastName(lastName);
                users.get(registerId).setPhone(phone);
                users.get(registerId).setEmail(email);

            }

        }
    }
}
