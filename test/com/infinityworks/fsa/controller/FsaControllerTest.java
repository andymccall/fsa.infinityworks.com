package com.infinityworks.fsa.controller;

import com.infinityworks.fsa.service.AuthoritiesService;
import com.infinityworks.fsa.service.EstablishmentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * The FsaControllerTest class contains
 * unit tests for the FsaController.  These
 * unit tests should be maintained prior to the
 * FsaController being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class FsaControllerTest {

    private MockMvc mockMvc;

    @Mock
    private AuthoritiesService mockAuthoritiesService;

    @Mock
    private EstablishmentService mockEstablishmentService;

    @InjectMocks
    private FsaController fsaController;


    @Before
    public void setUp() throws Exception {

        // this must be called for the @Mock annotations above to be processed
        // and for the mock service to be injected into the controller under
        // test.
        MockitoAnnotations.initMocks(this);

        mockAuthoritiesService = mock(AuthoritiesService.class);

        mockEstablishmentService = mock(EstablishmentService.class);

        mockMvc = MockMvcBuilders.standaloneSetup(fsaController).build();

    }

    @Test

    public void FsaController_IndexIsGot_Passes() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

}