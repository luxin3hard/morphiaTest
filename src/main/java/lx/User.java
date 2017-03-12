package lx;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
/**
 * Created by luxin on 2016/6/23.
 */
@Entity
public class User {

    @Id
    private long id;

    private String name;
    private int age;

    public User(){
    }

    public User(long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.id+"#"+this.name+"#"+this.age;
    }

}
