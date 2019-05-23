package com.orc.sandbox.post.controller.user;

import com.orc.sandbox.base.bo.Result;
import com.orc.sandbox.post.vo.CommentNodeVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @GetMapping("/get/{cid}")
    public Result<List<CommentNodeVO>> get(@PathVariable("cid") Long cid) {
        Result<List<CommentNodeVO>> rs = new Result<>();

        return rs;
    }
}
