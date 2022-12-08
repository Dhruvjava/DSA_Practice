package org.dt;

import java.util.Arrays;
import java.util.List;

public class UpdateList {

  public static void main(String[] args) throws Exception{
    List<User> users= Arrays.asList(new User("dhruv","agra"),new User("Ankit","agra"));

    List<User> users1= Arrays.asList(new User("dhruv","hyd"),new User("Ankit","hyd"));

    //User user=new User("dhruv","agra");
    users.forEach(user -> users1.stream()
        .filter(u-> u.getName().equals(user.getName()))
        .findFirst().ifPresent(u-> user.setAdd(u.getAdd())));
    System.out.println(users);


  }
}
class User{
  private String name;

  private String add;

  public User(String name, String add) {
    this.name = name;
    this.add = add;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", add='" + add + '\'' +
        '}';
  }
}
