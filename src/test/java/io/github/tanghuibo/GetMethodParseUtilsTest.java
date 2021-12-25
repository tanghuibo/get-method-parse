package io.github.tanghuibo;

import io.github.github.*;
import io.github.tanghuibo.TestBean;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * NameGetterTest
 *
 * @author tanghuibo
 * @date 2021/12/25 17:22
 */
public class GetMethodParseUtilsTest {

    @Test
    public void getFiledName() {
        Assert.assertEquals("name", GetMethodParseUtils.getFiledName(((SFunction<TestBean, String>)TestBean::getName)));
        Assert.assertEquals("value", GetMethodParseUtils.getFiledName(((SFunction<TestBean, String>)TestBean::getValue)));
        Assert.assertEquals("id", GetMethodParseUtils.getFiledName(((SFunction<TestBean, Long>)TestBean::getId)));
        Assert.assertEquals("aliasList", GetMethodParseUtils.getFiledName(((SFunction<TestBean, List<String>>)TestBean::getAliasList)));
        Assert.assertEquals("next", GetMethodParseUtils.getFiledName(((SFunction<TestBean, TestBean>)TestBean::getNext)));
    }


}
