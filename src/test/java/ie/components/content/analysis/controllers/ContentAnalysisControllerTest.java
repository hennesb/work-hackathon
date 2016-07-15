/**
 * 
 */
package ie.components.content.analysis.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import ie.components.configuration.AppConfiguration;
import ie.components.home.controllers.HomeController;

/**
 * @author ashish
 *
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextHierarchy({
	@ContextConfiguration(classes = AppConfiguration.class)
})
public class ContentAnalysisControllerTest {
	
	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ie.components.home.controllers.HomeController#sayHello(org.springframework.ui.ModelMap)}.
	 * @throws Exception 
	 */
	@Test
	public void testingthepage() throws Exception {
		mockMvc.perform(get("/app/content-analysis")).andExpect(status().isOk());
	}

}
