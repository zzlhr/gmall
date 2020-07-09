package com.lhrsite.gmall.vo;

import com.lhrsite.gmall.entity.Admin;
import com.lhrsite.gmall.entity.Role;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 管理员登陆详情
 *
 * @author: zzlhr
 * @create: 2020/07/09 16:49
 */
@Data
public class AdminDetailVO extends Admin implements UserDetails {

    private Set<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    /**
     * 指示用户帐户是否已过期。无法使用过期的帐户
     * 已验证.
     *
     * @return true帐户有效（即将过期）或"
     * false，如果不再有效（即将过期）
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return super.getStatus() == 1;
    }
}
