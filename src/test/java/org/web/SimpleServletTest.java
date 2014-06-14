package org.web;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Sidhavratha on 15/6/14.
 */
public class SimpleServletTest {

    @Test
    public void testGetContent() throws Exception {
        Assert.assertEquals("SimpleServlet Executed", new SimpleServlet().getContent());
    }
}
