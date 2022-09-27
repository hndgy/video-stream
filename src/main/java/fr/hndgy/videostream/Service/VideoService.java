package fr.hndgy.videostream.Service;

import org.springframework.core.io.Resource;

import reactor.core.publisher.Mono;

public interface VideoService {
    Mono<Resource> getVideo(String title);
}
