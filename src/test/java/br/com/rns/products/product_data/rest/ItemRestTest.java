package br.com.rns.products.product_data.rest;

import br.com.rns.products.product_data.ProductDataApplication;
import br.com.rns.products.product_data.entity.Item;
import br.com.rns.products.product_data.service.ItemService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = ProductDataApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@AutoConfigureMockMvc
class ItemRestTest {

    @LocalServerPort
    private int portApp;

    @Autowired
    private ItemService itemService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    @Disabled
    void getItems() throws Exception {
        itemService.saveItem(new Item(1L, "pathImage", "description", "itemName", "partner-test", "partner-link-teste", 10.0, 5, true, "masculino", "20/01/2025"));
        var mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/item/all")).andReturn();
        var jsonObject = new JsonArray();
        jsonObject.add(mvcResult.getResponse().getContentAsString(StandardCharsets.UTF_8));


        assertEquals(200, mvcResult.getResponse().getStatus());
        assertEquals(1, jsonObject.size());


    }


    @Test
    @Disabled
    void inserirItemComSucesso() throws Exception {
        var item = new Item(2L, "pathImage", "description", "itemName", "partner", "partner-Link-teste", 10.0, 5, true, "masculino", "20/01/2025");
        var json = new Gson().toJson(item);
        var postSaveItem = mockMvc.perform(MockMvcRequestBuilders.post("/item/save")
                .contentType("application/json")
                .content(json)).andReturn();


        var itemsActived = itemService.findItemsActived();

        assertEquals(200, postSaveItem.getResponse().getStatus());
        assertEquals(1, itemsActived.size());


    }
}

