package hibernate.recommendation;


import javax.persistence.*;

/**
 * Created by liker on 23/07/2015 0023.
 * Group iTailor.hunters.neu.edu.cn
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
//    @Column(name = "nickname",unique = true)
    @Column(name = "nickname")
    private String nickname = "";

//    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinColumn(name = "account")
//    private Account account;

//    private UserType userType;
//
//    private Wardrobe rootWardrobe;
//    private List<Message> pushMessageList;


//    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinColumns(value = {@JoinColumn(name = "loginRecords", referencedColumnName = "id")})
//    private ArrayList<LoginRecord> loginRecords;

//    public User(String nickname, Account account) {
//        this.nickname = nickname;
//        this.account = account;
//    }

    public User() {
        this.nickname = "anonymous";
    }

    public User(String nickname) {
        this.nickname = nickname;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

}
