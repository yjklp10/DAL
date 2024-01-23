package kr.co.Dal.store.web;

import kr.co.Dal.store.model.StoreVO;
import kr.co.Dal.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    // 스토어 메인 url 매핑
    @GetMapping("/storeMain")
    public String storeMain() {
        return "store/storeMain";
    }

    // 스토어 메인 목록 조회
    @GetMapping("/selectProdList")
    public ResponseEntity<Map<String, Object>> selectProdList(StoreVO storeVO){
        Map<String, Object> result = new HashMap<>();
        result.put("list", storeService.selectStoreList(storeVO));
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/storeList")
    public String storeList() {
        return "store/storeList";
    }

    @GetMapping("/storeView")
    public String storeView() {
        return "store/storeView";
    }

    @GetMapping("/storeCart")
    public String storeCart() {
        return "store/order/storeCart";
    }

    @GetMapping("/storeOrder")
    public String storeOrder() {
        return "store/order/storeOrder";
    }

    @GetMapping("/storeOrderResult")
    public String storeOrderResult() {
        return "store/order/storeOrderResult";
    }

    // 스토어 문의글 작성 url 매핑
    @GetMapping("/storeQnaWrite")
    public String storeQnaWrite() {
        return "store/storeQnaWrite";
    }

}
