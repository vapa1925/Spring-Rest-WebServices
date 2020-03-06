package com.pavan.springrestwebservices.ControllerTest;

import com.pavan.springrestwebservices.model.user;
import com.pavan.springrestwebservices.userDao.userrepository;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class usercontrollertest extends AbstractTest {

    @Override
    @Before
    public  void setUp(){
        super.setUp();
    }
    @Test
    public void getallusers() throws Exception{
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/allusers").accept(MediaType.APPLICATION_JSON);

        MvcResult mvcResult=mvc.perform(requestBuilder).andReturn();
        int status=mvcResult.getResponse().getStatus();
        assertEquals(404,status);
        //String content=mvcResult.getResponse().getContentAsString();
       // user[] userlist =super.mapFromJson(content,user[].class);
        //assertTrue(userlist.length > 0);
    }
//    @Test
//    public void createuser() throws Exception{
//        String samplecontent="{\n    \"id\": 5,\n    \"name\":\"kumari\"\n}";
//        RequestBuilder requestBuilder = MockMvcRequestBuilders.patch("/createuser").accept(MediaType.APPLICATION_JSON).content(samplecontent).accept(MediaType.APPLICATION_JSON);
//
//        MvcResult mvcResult=mvc.perform(requestBuilder).andReturn();
//        int status=mvcResult.getResponse().getStatus();
//        MockHttpServletResponse response = mvcResult.getResponse();
//
//        assertEquals(HttpStatus.CREATED.value(), response.getStatus());
//
//        //String content=mvcResult.getResponse().getContentAsString();
//        // user[] userlist =super.mapFromJson(content,user[].class);
//        //assertTrue(userlist.length > 0);
//    }

}
