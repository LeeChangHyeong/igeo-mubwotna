package com.sparta.igeomubwotna.controller;

import com.sparta.igeomubwotna.dto.CommentRequestDto;
import com.sparta.igeomubwotna.dto.CommentResponseDto;
import com.sparta.igeomubwotna.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe/{recipeId}/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;
}
