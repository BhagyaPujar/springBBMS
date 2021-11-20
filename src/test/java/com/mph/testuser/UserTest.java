package com.mph.testuser;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mph.controller.UserController;
import com.mph.entity.User;
import com.mph.service.UserService;

@WebMvcTest(value =UserController.class, secure = false)
@ContextConfiguration(classes = {UserController.class})
@AutoConfigureMockMvc
public class UserTest {
	private MockMvc mockMvc;
    @InjectMocks
    UserController userController;
    
    @Mock
    UserService userService;

    @Before
    public void setUp(){
    	MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .build();
    }
    @Test
    public void TestingUser() throws Exception{
    	
    	
    	User usr = new User(1,"Jyothi","bandarujyothi1999@gmail.com","Hyderabad","1234",9949,"female");
        Mockito.when(UserService.getUserById(1)).thenReturn(usr);
        mockMvc.perform(MockMvcRequestBuilders.get("/user/getUser/1")
        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_id", Matchers.is(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_name",Matchers.is("Jyothi")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_email",Matchers.is("bandarujyothi1999@gmail.com")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_address",Matchers.is("Hyderabad")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_password",Matchers.is("1234")))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_mobile",Matchers.is(9949)))
                .andExpect(MockMvcResultMatchers.jsonPath("$.usr_gender",Matchers.is("female")));
        
        Mockito.verify(userService).getUserById(1);
    }
}