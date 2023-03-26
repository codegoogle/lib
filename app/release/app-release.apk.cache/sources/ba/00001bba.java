package com.google.android.gms.internal.ads;

import com.p7700g.p99005.r2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaek {
    @r2
    public static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    @z1
    public static zzbk zza(zzdy zzdyVar) {
        int zze = zzdyVar.zze() + zzdyVar.zzc();
        int zze2 = zzdyVar.zze();
        int i = (zze2 >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = zze2 & sr.s;
                if (i2 == 6516084) {
                    int zze3 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1684108385) {
                        zzdyVar.zzG(8);
                        String zzw = zzdyVar.zzw(zze3 - 16);
                        r6 = new zzabu("und", zzw, zzw);
                    } else {
                        "Failed to parse comment attribute: ".concat(zzadv.zzf(zze2));
                    }
                    return r6;
                } else if (i2 == 7233901 || i2 == 7631467) {
                    return zze(zze2, "TIT2", zzdyVar);
                } else {
                    if (i2 == 6516589 || i2 == 7828084) {
                        return zze(zze2, "TCOM", zzdyVar);
                    }
                    if (i2 == 6578553) {
                        return zze(zze2, "TDRC", zzdyVar);
                    }
                    if (i2 == 4280916) {
                        return zze(zze2, "TPE1", zzdyVar);
                    }
                    if (i2 == 7630703) {
                        return zze(zze2, "TSSE", zzdyVar);
                    }
                    if (i2 == 6384738) {
                        return zze(zze2, "TALB", zzdyVar);
                    }
                    if (i2 == 7108978) {
                        return zze(zze2, "USLT", zzdyVar);
                    }
                    if (i2 == 6776174) {
                        return zze(zze2, "TCON", zzdyVar);
                    }
                    if (i2 == 6779504) {
                        return zze(zze2, "TIT1", zzdyVar);
                    }
                }
            } else if (zze2 == 1735291493) {
                int zzb2 = zzb(zzdyVar);
                String str = (zzb2 <= 0 || zzb2 > 192) ? null : zza[zzb2 - 1];
                return str != null ? new zzacj("TCON", null, str) : null;
            } else if (zze2 == 1684632427) {
                return zzd(1684632427, "TPOS", zzdyVar);
            } else {
                if (zze2 == 1953655662) {
                    return zzd(1953655662, "TRCK", zzdyVar);
                }
                if (zze2 == 1953329263) {
                    return zzc(1953329263, "TBPM", zzdyVar, true, false);
                }
                if (zze2 == 1668311404) {
                    return zzc(1668311404, "TCMP", zzdyVar, true, true);
                }
                if (zze2 == 1668249202) {
                    int zze4 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1684108385) {
                        int zze5 = zzdyVar.zze() & sr.s;
                        String str2 = zze5 == 13 ? "image/jpeg" : zze5 == 14 ? "image/png" : null;
                        if (str2 != null) {
                            zzdyVar.zzG(4);
                            int i3 = zze4 - 16;
                            byte[] bArr = new byte[i3];
                            zzdyVar.zzB(bArr, 0, i3);
                            r6 = new zzabm(str2, null, 3, bArr);
                        }
                    }
                    return r6;
                } else if (zze2 == 1631670868) {
                    return zze(1631670868, "TPE2", zzdyVar);
                } else {
                    if (zze2 == 1936682605) {
                        return zze(1936682605, "TSOT", zzdyVar);
                    }
                    if (zze2 == 1936679276) {
                        return zze(1936679276, "TSO2", zzdyVar);
                    }
                    if (zze2 == 1936679282) {
                        return zze(1936679282, "TSOA", zzdyVar);
                    }
                    if (zze2 == 1936679265) {
                        return zze(1936679265, "TSOP", zzdyVar);
                    }
                    if (zze2 == 1936679791) {
                        return zze(1936679791, "TSOC", zzdyVar);
                    }
                    if (zze2 == 1920233063) {
                        return zzc(1920233063, "ITUNESADVISORY", zzdyVar, false, false);
                    }
                    if (zze2 == 1885823344) {
                        return zzc(1885823344, "ITUNESGAPLESS", zzdyVar, false, true);
                    }
                    if (zze2 == 1936683886) {
                        return zze(1936683886, "TVSHOWSORT", zzdyVar);
                    }
                    if (zze2 == 1953919848) {
                        return zze(1953919848, "TVSHOW", zzdyVar);
                    }
                    if (zze2 == 757935405) {
                        String str3 = null;
                        String str4 = null;
                        int i4 = -1;
                        int i5 = -1;
                        while (zzdyVar.zzc() < zze) {
                            int zzc = zzdyVar.zzc();
                            int zze6 = zzdyVar.zze();
                            int zze7 = zzdyVar.zze();
                            zzdyVar.zzG(4);
                            if (zze7 == 1835360622) {
                                str3 = zzdyVar.zzw(zze6 - 12);
                            } else if (zze7 == 1851878757) {
                                str4 = zzdyVar.zzw(zze6 - 12);
                            } else {
                                if (zze7 == 1684108385) {
                                    i5 = zze6;
                                }
                                if (zze7 == 1684108385) {
                                    i4 = zzc;
                                }
                                zzdyVar.zzG(zze6 - 12);
                            }
                        }
                        if (str3 != null && str4 != null && i4 != -1) {
                            zzdyVar.zzF(i4);
                            zzdyVar.zzG(16);
                            r6 = new zzacd(str3, str4, zzdyVar.zzw(i5 - 16));
                        }
                        return r6;
                    }
                }
            }
            zzadv.zzf(zze2);
            return null;
        } finally {
            zzdyVar.zzF(zze);
        }
    }

    private static int zzb(zzdy zzdyVar) {
        zzdyVar.zzG(4);
        if (zzdyVar.zze() == 1684108385) {
            zzdyVar.zzG(8);
            return zzdyVar.zzk();
        }
        return -1;
    }

    @z1
    private static zzacb zzc(int i, String str, zzdy zzdyVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzdyVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 < 0) {
            "Failed to parse uint8 attribute: ".concat(zzadv.zzf(i));
            return null;
        } else if (z) {
            return new zzacj(str, null, Integer.toString(zzb2));
        } else {
            return new zzabu("und", str, Integer.toString(zzb2));
        }
    }

    @z1
    private static zzacj zzd(int i, String str, zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        if (zzdyVar.zze() == 1684108385 && zze >= 22) {
            zzdyVar.zzG(10);
            int zzo = zzdyVar.zzo();
            if (zzo > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzo);
                String sb2 = sb.toString();
                int zzo2 = zzdyVar.zzo();
                if (zzo2 > 0) {
                    sb2 = sb2 + "/" + zzo2;
                }
                return new zzacj(str, null, sb2);
            }
        }
        "Failed to parse index/count attribute: ".concat(zzadv.zzf(i));
        return null;
    }

    @z1
    private static zzacj zze(int i, String str, zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        if (zzdyVar.zze() == 1684108385) {
            zzdyVar.zzG(8);
            return new zzacj(str, null, zzdyVar.zzw(zze - 16));
        }
        "Failed to parse text attribute: ".concat(zzadv.zzf(i));
        return null;
    }
}