public class AccountList extends Static{

    public void listAccount(){
        for (Account account:accounts)
        {
            System.out.println("\n\n\nID: "+account.getId());
            System.out.println("Kullanıcı Adı: "+account.getUsername());
            System.out.println("Şifre: "+account.getPassword());
        }
    }
}
