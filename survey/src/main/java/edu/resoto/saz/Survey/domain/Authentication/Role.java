package edu.resoto.saz.Survey.domain.Authentication;

import edu.resoto.saz.Survey.domain.Authentication.Person;
import edu.resoto.saz.Survey.domain.Authentication.gen.RoleGen;
import java.util.List;

public class Role implements RoleGen {

    public Role() {
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private List<Person> users;

    @Override
    public List<Person> getUsers() {
        return users;
    }

    @Override
    public void setUsers(List<Person> users) {
        this.users = users;
    }

    public Role(String name, List<Person> users) {
        this.name = name;
        this.users = users;
    }
}
