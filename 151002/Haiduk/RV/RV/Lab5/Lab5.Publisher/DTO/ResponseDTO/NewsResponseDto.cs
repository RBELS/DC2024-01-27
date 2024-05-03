﻿using Lab5.Publisher.Models;

namespace Lab5.Publisher.DTO.ResponseDTO;

public class NewsResponseDto
{
    public long Id { get; set; }
    public long CreatorId { get; set; }
    public Creator Creator { get; set; }
    public string Title { get; set; }
    public string Content { get; set; }
    public DateTime Created { get; set; }
    public DateTime Modified { get; set; }
}