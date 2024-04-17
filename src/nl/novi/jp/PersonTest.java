package nl.novi.jp;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void nameShouldNotBeChangedDuringCreation() {
        //ARRANGE
        Person p = new Person("Nick");
        //ACT
        //ASSERT
        assertEquals("Nick", p.getName());
    }

    @Test
    void personWithoutNameShouldBeNamedJohn() {
        //ARRANGE
        Person p = new Person();
        //ACT
        //ASSERT
        assertEquals("John", p.getName());
    }

    @Test
    void ageShouldAddOneYear() {
        //ARRANGE
        Person p = new Person();
        p.setAge(18);

        //ACT
        p.age();

        //ASSERT
        assertEquals(19, p.getAge());
    }

    @Test
    void lastNameShouldStartWithUpperCaseWhenLowercaseGiven() {
        //ARRANGE
        Person p = new Person();
        //ACT
        p.setLastName("jansen");
        //ASSERT
        assertEquals("Jansen", p.getLastName());

    }

    @Test
    void givenAPartnerHasPartnerShouldReturnTrue() {
        //ARRANGE
        Person p1 = new Person();
        Person p2 = new Person();
        //ACT
        p1.setPartner(p2);
        //ASSERT
        assertTrue(p1.hasPartner());
    }

    @Test
    void childShouldBeAddedToList() {
        //ARRANGE
        Person p = new Person();
        Person c = new Person();
        //ACT
        p.addChild(c);
        //ASSERT
        assertEquals(1, p.getChildren().size());
        assertEquals(c.getName(), p.getChildren().get(0).getName());
    }

    @Test
    void childWithNonUniqueNameCannotBeAddedToList() {
        //ARRANGE
        Person p = new Person();
        Person c1 = new Person();
        Person c2 = new Person();
        //ACT
        p.addChild(c1);
        p.addChild(c2);
        //ASSERT
        assertEquals(1, p.getChildren().size());
    }

}