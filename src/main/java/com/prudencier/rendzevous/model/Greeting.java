package com.prudencier.rendzevous.model;

public class Greeting {
    private long Id;
    private String name;
public Greeting(long id, String name1)
{
    Id=id;
    this.name = name1;
}
    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
