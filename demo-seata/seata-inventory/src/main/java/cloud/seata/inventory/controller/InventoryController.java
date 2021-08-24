package cloud.seata.inventory.controller;

import cloud.seata.inventory.service.InventoryService;
import com.seata.feign.InventoryFeign;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InventoryController implements InventoryFeign {

    @Resource
    private InventoryService inventoryService ;

    @Override
    public Integer updateInventory(Integer inventory) {
        return inventoryService.updateInventory(inventory) ;
    }

}
