package io.github.tanghuibo;

import java.util.List;

/**
 * TestBean
 *
 * @author tanghuibo
 * @date 2021/12/25 18:08
 */
public class TestBean {
    private String name;

    private String value;

    private Long id;

    private List<String> aliasList;

    private TestBean next;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getAliasList() {
        return aliasList;
    }

    public void setAliasList(List<String> aliasList) {
        this.aliasList = aliasList;
    }

    public TestBean getNext() {
        return next;
    }

    public void setNext(TestBean next) {
        this.next = next;
    }
}
