package com.alex.ecommerce.service;

import com.alex.ecommerce.domain.Perfume;
import com.alex.ecommerce.dto.request.SearchRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PerfumeService {

    Perfume getPerfumeById(Long perfumeId);

    List<Perfume> getPopularPerfumes();

    Page<Perfume> getPerfumesByFilterParams(SearchRequest searchRequest, Pageable pageable);

    Page<Perfume> searchPerfumes(SearchRequest searchRequest, Pageable pageable);
}
