/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.upstream.Loader;

/**
 * A {@link ChunkSource} for SmoothStreaming.
 */
public interface SmoothStreamingChunkSource extends ChunkSource {

  interface Factory {

    SmoothStreamingChunkSource createChunkSource(Loader manifestLoader,
        SmoothStreamingManifest manifest, int elementIndex, TrackGroup trackGroup, int[] tracks,
        TrackEncryptionBox[] trackEncryptionBoxes);

  }

  void updateManifest(SmoothStreamingManifest newManifest);

}
