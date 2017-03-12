package lx;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import org.bson.Document;
import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import java.net.UnknownHostException;

/**
 * Created by luxin on 2016/6/23.
 */
public class MorphiaTest {

    private MongoClient mongoClient = null;
    static Datastore datastore;

    public void init() {
        mongoClient = new MongoClient("172.31.160.2",27017);
        datastore = new Morphia().createDatastore(mongoClient, "FS-Checkins-Office-DB");
    }

    public void save(User user) {
        datastore.save(user);
        System.out.println("save ! ");
    }

 /*   public static void main(String[] args) {
        MorphiaTest morphicTest = new MorphiaTest();
        morphicTest.init();
        User user = new User(123457L, "Tom", 25);
        morphicTest.save(user);
    }*/



    public static void main(String[] args) {
        MorphiaTest morphicTest = new MorphiaTest();
        morphicTest.init();
        Query<UserRuleIndexEntity> query = datastore.createQuery(UserRuleIndexEntity.class);
        query.criteria(UserRuleIndexEntity.Field_ruleId).notEqual("");
        Query<UserRuleIndexEntity> cloneQuery = query.cloneQuery();
        cloneQuery.criteria(UserRuleIndexEntity.Field_isStop).equal(1);
        System.out.println(query.asList().size());
        System.out.println(cloneQuery.asList().size());
        System.out.println(query.asList().size());
    }

  /*  @Test
    public void cloneTest(){

        MorphiaTest morphicTest = new MorphiaTest();
        morphicTest.init();
        Query<UserRuleIndexEntity> query = datastore.createQuery(UserRuleIndexEntity.class);
        query.criteria(UserRuleIndexEntity.Field_ruleId).notEqual("");

        Query<UserRuleIndexEntity> cloneQuery = query.cloneQuery();

        cloneQuery.criteria(UserRuleIndexEntity.Field_isStop).equal(1);

        System.out.println(query.asList().size());
        System.out.println(cloneQuery.asList().size());










    }*/










}
